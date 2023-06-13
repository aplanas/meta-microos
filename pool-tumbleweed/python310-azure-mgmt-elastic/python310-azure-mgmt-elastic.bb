SUMMARY = "Microsoft Azure Elastic Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Elastic Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-mgmt-elastic-1.0.0-1.8.noarch.rpm"
RPM_HASH = "4f3c33fe233fb8c458299c737e8565d58f7d34ad69b99a79a451977dff3812161dc96c0b570204fdaa7d588dd042603ad095f94e62cc263ef0d0e8ed614fb8d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-elastic \
python3.10dist(azure-mgmt-elastic) \
python310-azure-mgmt-elastic \
python3dist(azure-mgmt-elastic)"

RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
