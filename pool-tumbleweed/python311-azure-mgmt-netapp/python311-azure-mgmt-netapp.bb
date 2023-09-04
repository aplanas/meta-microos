SUMMARY = "Microsoft Azure NetApp Files Management Client Library"
DESCRIPTION = "This is the Microsoft Azure NetApp Files Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "10.1.0"

RPM_NAME = "python311-azure-mgmt-netapp-10.1.0-1.1.noarch.rpm"
RPM_HASH = "e7274bf6c4d955ebcab2f0ec8a121950a6537c4d4fec8d328944d1abce54c62dade29f85898bdbd60c66e40b1b3be50a143b0236f848c86f9f89bb94007b1e5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-netapp \
python3.11dist-azure-mgmt-netapp \
python311-azure-mgmt-netapp \
python3dist-azure-mgmt-netapp"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
