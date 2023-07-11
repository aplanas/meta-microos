SUMMARY = "Microsoft Azure Policy Insights Client Library"
DESCRIPTION = "This is the Microsoft Azure Policy Insights Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.1.0b4"

RPM_NAME = "python311-azure-mgmt-policyinsights-1.1.0b4-1.4.noarch.rpm"
RPM_HASH = "04f61626f2d18147ae3296dde73b7c3c5b7b2ac9d34ce691a5a5d31dfb941ab10cf29dfb40a0007b6534386a3fa6f3ca6fdef201089b7cf07a1cde78a9c032e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-policyinsights \
python3.11dist-azure-mgmt-policyinsights \
python311-azure-mgmt-policyinsights \
python3dist-azure-mgmt-policyinsights"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
