SUMMARY = "Microsoft Azure SQL Virtual Machine Management Client Library"
DESCRIPTION = "This is the Microsoft Azure SQL Virtual Machine Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0b6"

RPM_NAME = "python311-azure-mgmt-sqlvirtualmachine-1.0.0b6-1.1.noarch.rpm"
RPM_HASH = "5e53ab869177da50b00bf4d98476a30c4ffc805db648b0b0123bfcbe802711feedfd453de45525fa1335881a159ede96b9d13a1ccc63d51b46aa8fb9060a7617"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-sqlvirtualmachine \
python3.11dist-azure-mgmt-sqlvirtualmachine \
python311-azure-mgmt-sqlvirtualmachine \
python3dist-azure-mgmt-sqlvirtualmachine"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
