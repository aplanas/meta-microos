SUMMARY = "Python setuptools handler for SCM tags"
DESCRIPTION = "The setuptools_scm package handles managing one's Python package versions \
in SCM metadata. It also handles file finders for the supperted SCMs."
LICENSE = "MIT"

PV = "7.1.0"

RPM_NAME = "python39-setuptools_scm-7.1.0-2.1.noarch.rpm"
RPM_HASH = "ba88cb961b846f8d589a6eb656494c893cc9a3caddeba2c49f13779434d2e22fb26727b4a8e59d9b3346cce68089f83a46cdfaf10b773db0a4f9e3ef5853cf07"
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
