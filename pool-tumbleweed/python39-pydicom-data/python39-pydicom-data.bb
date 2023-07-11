SUMMARY = "Test files for pydicom"
DESCRIPTION = "Test files used by pydicom and other packages by the same organisation."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-pydicom-data-1.0.0-1.5.noarch.rpm"
RPM_HASH = "5a5841199e184af6c47eb732c7d711f4311cc546cb6377727c9b4adfa08789d3ffbae0e65f4e5ce432f40463434b546ada5975e8b26368c2bb5fa0f0c3f46d57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pydicom-data \
python39-pydicom-data \
python3dist-pydicom-data"

RDEPENDS:${PN} += "python-abi"

inherit rpm
