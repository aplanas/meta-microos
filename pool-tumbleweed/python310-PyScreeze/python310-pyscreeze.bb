SUMMARY = "A screenshot Python module"
DESCRIPTION = "PyScreeze is a screenshot module for Python 2 and 3."
LICENSE = "BSD-3-Clause"

PV = "0.1.28"

RPM_NAME = "python310-PyScreeze-0.1.28-1.5.noarch.rpm"
RPM_HASH = "aa4afc0872fcff180ac23e756b45adc10d7fa324146616f1fe9b23aa4b7952cfde409ff22f7782cbb9aeda4727a2e163201d32e840ad4b735c225d0f0c9c568a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyscreeze \
python310-PyScreeze \
python3dist-pyscreeze"

RDEPENDS:${PN} += "python-abi \
python310-Pillow"

inherit rpm
