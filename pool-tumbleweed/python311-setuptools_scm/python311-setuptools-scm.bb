SUMMARY = "Python setuptools handler for SCM tags"
DESCRIPTION = "The setuptools_scm package handles managing one's Python package versions \
in SCM metadata. It also handles file finders for the supperted SCMs."
LICENSE = "MIT"

PV = "7.1.0"

RPM_NAME = "python311-setuptools_scm-7.1.0-1.1.noarch.rpm"
RPM_HASH = "b74e68bcb04ff40ed501feffa6d8f1fa6cf0e3f0de8faaa35d0aaf417f5f9e5efd7f0ce166f779fbf78a15cd1ca164465d4bcba7bb37b22f77e4c6413e349212"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-setuptools-scm \
python311-setuptools-scm \
python3dist-setuptools-scm"

RDEPENDS:${PN} += "python-abi \
python311-packaging \
python311-setuptools \
python311-typing-extensions"

inherit rpm
