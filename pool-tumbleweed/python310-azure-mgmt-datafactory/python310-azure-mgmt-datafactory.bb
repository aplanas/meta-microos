SUMMARY = "Microsoft Azure Data Factory Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Data Factory Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python310-azure-mgmt-datafactory-3.1.0-1.3.noarch.rpm"
RPM_HASH = "83ff4f98851fd9b1874bd6c91ea9561e66d557a522749008b3342379beea72ebfe392ec608512afa5f9278920b52de6efc942bf83e761d404f1d862191d9bafb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-datafactory \
python310-azure-mgmt-datafactory \
python3dist-azure-mgmt-datafactory"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
