SUMMARY = "Microsoft Azure NetApp Files Management Client Library"
DESCRIPTION = "This is the Microsoft Azure NetApp Files Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "10.0.0"

RPM_NAME = "python311-azure-mgmt-netapp-10.0.0-1.1.noarch.rpm"
RPM_HASH = "35c1b71318fb96063362553bc09929c939391fafeececc2f9891dfd294596662687e3b5a25e4bb54562b622ce2c51471ca957f54995d346f5ce4e563e04ac8fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-mgmt-netapp \
python311-azure-mgmt-netapp \
python3dist-azure-mgmt-netapp"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
