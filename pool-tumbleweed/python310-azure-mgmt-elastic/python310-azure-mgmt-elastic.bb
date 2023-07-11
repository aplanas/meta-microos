SUMMARY = "Microsoft Azure Elastic Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Elastic Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-mgmt-elastic-1.0.0-1.9.noarch.rpm"
RPM_HASH = "9ff5819343a10656f675877e2bb987e65a0c6aa12de949e2b982d3df720d95a75665c4a9b610b6de070233d852f29c68e6d1d79eb44708bdf66260ab99d3187a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-elastic \
python310-azure-mgmt-elastic \
python3dist-azure-mgmt-elastic"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
