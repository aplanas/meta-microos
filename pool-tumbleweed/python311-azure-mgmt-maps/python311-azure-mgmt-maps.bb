SUMMARY = "Microsoft Azure Maps Client Library"
DESCRIPTION = "This is the Microsoft Azure Maps Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-azure-mgmt-maps-2.0.0-1.9.noarch.rpm"
RPM_HASH = "5dc50d7051be478f8e063aeca4001d1f5c937076be10c96345308dbfaac48eaf5bb4d8a0472f364ef7e1c4cfc6aa2604c17b2eff5e5c1d882dfd111521af9cf3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-maps \
python3.11dist-azure-mgmt-maps \
python311-azure-mgmt-maps \
python3dist-azure-mgmt-maps"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
