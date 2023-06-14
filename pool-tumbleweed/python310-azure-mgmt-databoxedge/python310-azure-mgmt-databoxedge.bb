SUMMARY = "Microsoft Azure MyService Management Client Library"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-mgmt-databoxedge-1.0.0.0-1.8.noarch.rpm"
RPM_HASH = "df18b1dfad92d2ba8e5b21fd24c95c71186c66fa5cef745171cf23486a286b688f49fe4d28b42554814d1366dcd7e4f3130c6b46b3564c66357a91e65a52b7a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-databoxedge \
python3.10dist-azure-mgmt-databoxedge \
python310-azure-mgmt-databoxedge \
python3dist-azure-mgmt-databoxedge"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
