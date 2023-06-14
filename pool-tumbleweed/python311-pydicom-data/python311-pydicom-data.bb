SUMMARY = "Test files for pydicom"
DESCRIPTION = "Test files used by pydicom and other packages by the same organisation."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-pydicom-data-1.0.0-1.3.noarch.rpm"
RPM_HASH = "605e91118d9023546fcf2bef73e748c9e95d0c822e4be0e3e0375a97e07a5cb345a20515a93c199516a7b8dc68f24e5745413a815e315e92c573aabd1e96faf9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pydicom-data \
python311-pydicom-data \
python3dist-pydicom-data"

RDEPENDS:${PN} += "python-abi"

inherit rpm
