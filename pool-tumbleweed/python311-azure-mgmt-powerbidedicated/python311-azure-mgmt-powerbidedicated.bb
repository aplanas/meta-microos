SUMMARY = "Microsoft Azure PowerBIDedicated Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure PowerBIDedicated Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs \
that replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-powerbidedicated-1.0.0.0-1.9.noarch.rpm"
RPM_HASH = "dd55a25271dfa402b2f05069b3a8ea4f075b8ca85b2719e2d25c1acb7885039940ef7f7b3670cbfaa413a2ddc28299f1af43c6e28e661ebad3ef4125a42769ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-powerbidedicated \
python3.11dist-azure-mgmt-powerbidedicated \
python311-azure-mgmt-powerbidedicated \
python3dist-azure-mgmt-powerbidedicated"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
