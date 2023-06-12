SUMMARY = "Microsoft Azure NetApp Files Management Client Library"
DESCRIPTION = "This is the Microsoft Azure NetApp Files Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "10.0.0"

RPM_NAME = "python310-azure-mgmt-netapp-10.0.0-1.1.noarch.rpm"
RPM_HASH = "34d13a6b2d48a0a68b5664af72c6917ab3b88b288b2efb19cc650236099b542422ebbeb7a480133ef790cdff93d4c9b87c27adf7890ed867b43dbce403d4d6f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-netapp \
python3.10dist(azure-mgmt-netapp) \
python310-azure-mgmt-netapp \
python3dist(azure-mgmt-netapp)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) \
python(abi) \
python310-azure-common \
python310-azure-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
