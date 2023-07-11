SUMMARY = "Python setuptools handler for SCM tags"
DESCRIPTION = "The setuptools_scm package handles managing one's Python package versions \
in SCM metadata. It also handles file finders for the supperted SCMs."
LICENSE = "MIT"

PV = "7.1.0"

RPM_NAME = "python39-setuptools_scm-7.1.0-1.3.noarch.rpm"
RPM_HASH = "3e9306960040c50ee7a21e77cf87ae4f09fa0b057a8c77f35acb47c69b00eeffed5cd79a9ab7270c9bff195b4f2cb40fb97dcc863aa2566411d3221dac8cf675"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-setuptools-scm \
python39-setuptools-scm \
python3dist-setuptools-scm"

RDEPENDS:${PN} += "python-abi \
python39-packaging \
python39-setuptools \
python39-tomli \
python39-typing-extensions"

inherit rpm
