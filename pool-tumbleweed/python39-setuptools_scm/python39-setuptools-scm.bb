SUMMARY = "Python setuptools handler for SCM tags"
DESCRIPTION = "The setuptools_scm package handles managing one's Python package versions \
in SCM metadata. It also handles file finders for the supperted SCMs."
LICENSE = "MIT"

PV = "7.1.0"

RPM_NAME = "python39-setuptools_scm-7.1.0-1.1.noarch.rpm"
RPM_HASH = "a15ec7dc73b0b714ca8329656dd968116a84457221dd7d66e424e05d8259a49f837a38b4725891b452bab5179f8a7d588854351e7c961aa7cf142c0055b72e52"
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
