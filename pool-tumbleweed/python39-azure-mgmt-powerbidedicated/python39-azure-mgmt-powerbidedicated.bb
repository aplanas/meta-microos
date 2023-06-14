SUMMARY = "Microsoft Azure PowerBIDedicated Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure PowerBIDedicated Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs \
that replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-powerbidedicated-1.0.0.0-1.8.noarch.rpm"
RPM_HASH = "7dd0b75f78082a0a6b0e33fd8782d0a214230156a233c2d0cf8b9035c8e00128260eb137ba319c2bf5c251b3bfed0bfde3a56443d962b13045a9b502106e77f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-powerbidedicated \
python39-azure-mgmt-powerbidedicated \
python3dist-azure-mgmt-powerbidedicated"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
