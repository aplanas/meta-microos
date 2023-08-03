SUMMARY = "Microsoft Azure Cost Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Cost Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.0.1"

RPM_NAME = "python311-azure-mgmt-costmanagement-4.0.1-1.1.noarch.rpm"
RPM_HASH = "78ced7bd80042bd80f47a79c40a14566f6399c7e102ad8935a3cd23cdec8ba347aca12761ed3f442314d4e306bcde35867e25bd8a3dae0e617f0fa471f127945"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-costmanagement \
python3.11dist-azure-mgmt-costmanagement \
python311-azure-mgmt-costmanagement \
python3dist-azure-mgmt-costmanagement"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
