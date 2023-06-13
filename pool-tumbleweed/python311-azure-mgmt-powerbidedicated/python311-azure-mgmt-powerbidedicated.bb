SUMMARY = "Microsoft Azure PowerBIDedicated Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure PowerBIDedicated Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs \
that replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-powerbidedicated-1.0.0.0-1.8.noarch.rpm"
RPM_HASH = "ce770fc787d026b5adaaee0ba31de1313d81a2ed94e10de5ca5c14b10797904d788d8fb3022ebd6dc5af1e63a4e8645654415208dde595158cdf0cea41712550"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-powerbidedicated) \
python311-azure-mgmt-powerbidedicated \
python3dist(azure-mgmt-powerbidedicated)"

RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
