SUMMARY = "Microsoft Azure Servicenetworking Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Servicenetworking Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0~b2"

RPM_NAME = "python310-azure-mgmt-servicenetworking-1.0.0~b2-1.2.noarch.rpm"
RPM_HASH = "0d2d756197339d54bb5c0cb3c25b6e2042ae6bd219dc3e3e18245d6eb8986090524ed87f01d13b6fd135e776c6f578302b79eccbbbde783fc7f3ad9b378c9f95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-servicenetworking \
python310-azure-mgmt-servicenetworking \
python3dist-azure-mgmt-servicenetworking"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
