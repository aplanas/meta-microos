SUMMARY = "Microsoft Azure Advisor Client Library"
DESCRIPTION = "This is the Microsoft Azure Advisor Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "9.0.0"

RPM_NAME = "python311-azure-mgmt-advisor-9.0.0-1.10.noarch.rpm"
RPM_HASH = "f696580481ec49fa0f171dc821b37afa619b7d42771181af874bd8fa6d2455956497d5e3d0a25eb5a1ec36db8c5850ef116263e30ce95fdf088bb4e3fda99e1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-advisor) \
python311-azure-mgmt-advisor \
python3dist(azure-mgmt-advisor)"

RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
