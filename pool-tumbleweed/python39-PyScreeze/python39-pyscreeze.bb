SUMMARY = "A screenshot Python module"
DESCRIPTION = "PyScreeze is a screenshot module for Python 2 and 3."
LICENSE = "BSD-3-Clause"

PV = "0.1.28"

RPM_NAME = "python39-PyScreeze-0.1.28-1.5.noarch.rpm"
RPM_HASH = "19c7750a4a64cb5a43a2e49dfe7e469b95b560f9592b34c0037897fc3215bfad238ca60e03ae2ec5eef6e15dd5a4aa9abbad369a0be7b89d61605957d6e0a1fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyscreeze \
python39-PyScreeze \
python3dist-pyscreeze"

RDEPENDS:${PN} += "python-abi \
python39-Pillow"

inherit rpm
