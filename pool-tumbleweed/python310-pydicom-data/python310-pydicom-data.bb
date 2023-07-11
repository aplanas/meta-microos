SUMMARY = "Test files for pydicom"
DESCRIPTION = "Test files used by pydicom and other packages by the same organisation."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-pydicom-data-1.0.0-1.5.noarch.rpm"
RPM_HASH = "9ed91eb29de234472566e8e22a13dcfc4ac64b3babb9831ba4fb671cecfe942b575234872c23d43e630e15992c0f7050234851fcd14cf2c2ec9428d9567622ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pydicom-data \
python310-pydicom-data \
python3dist-pydicom-data"

RDEPENDS:${PN} += "python-abi"

inherit rpm
