SUMMARY = "Python video metadata parser"
DESCRIPTION = "Enzyme is a Python module to parse video metadata."
LICENSE = "Apache-2.0"

PV = "0.4.1"

RPM_NAME = "python39-enzyme-0.4.1-4.14.noarch.rpm"
RPM_HASH = "34b8ae40afeb7d76d293ca79a5e01fdbaee0eed544cece8b154972027940ef2c93b5aede63f515a8e2b05697ec69330436a1310abc714f7963f71a454e11eb4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-enzyme \
python39-enzyme \
python3dist-enzyme"

RDEPENDS:${PN} += "python-abi"

inherit rpm
