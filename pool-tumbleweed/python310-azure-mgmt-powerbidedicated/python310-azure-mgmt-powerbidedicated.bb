SUMMARY = "Microsoft Azure PowerBIDedicated Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure PowerBIDedicated Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs \
that replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-mgmt-powerbidedicated-1.0.0.0-1.8.noarch.rpm"
RPM_HASH = "3ca7d57505a6b17474e94f350ec4e04569e8279a9725e66fa9b3622c9911c03290698bcd93dbcc3d0fb27836000c24cb4159f362d870669b8ded624ebf97b7a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-powerbidedicated \
python3.10dist-azure-mgmt-powerbidedicated \
python310-azure-mgmt-powerbidedicated \
python3dist-azure-mgmt-powerbidedicated"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
