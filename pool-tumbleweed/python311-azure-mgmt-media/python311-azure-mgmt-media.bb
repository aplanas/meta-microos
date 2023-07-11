SUMMARY = "Microsoft Azure Media Services Client Library"
DESCRIPTION = "This is the Microsoft Azure Media Services Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "10.2.0"

RPM_NAME = "python311-azure-mgmt-media-10.2.0-1.4.noarch.rpm"
RPM_HASH = "dfdd905c91bd959ffa07d0ad71e6e4aa1f177cbc15683bc0815cb1644f40c94deb784b57cbf8e1315775586c10ea0f808cc7e889ab16484464edd1e7aaddc395"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-media \
python3.11dist-azure-mgmt-media \
python311-azure-mgmt-media \
python3dist-azure-mgmt-media"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
