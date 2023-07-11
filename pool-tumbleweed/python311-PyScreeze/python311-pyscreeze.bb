SUMMARY = "A screenshot Python module"
DESCRIPTION = "PyScreeze is a screenshot module for Python 2 and 3."
LICENSE = "BSD-3-Clause"

PV = "0.1.28"

RPM_NAME = "python311-PyScreeze-0.1.28-1.5.noarch.rpm"
RPM_HASH = "f7e11d580dc3ba8e13481f6ec5edbe02eb22665690c574aa4e913fd0e4e14e0bcd6eb3b310675099c32181699f6f477fd6e7ad1931dcbdeb4d7bb33061f5b3a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyScreeze \
python3.11dist-pyscreeze \
python311-PyScreeze \
python3dist-pyscreeze"

RDEPENDS:${PN} += "python-abi \
python311-Pillow"

inherit rpm
