SUMMARY = "Microsoft Azure Policy Insights Client Library"
DESCRIPTION = "This is the Microsoft Azure Policy Insights Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.1.0b4"

RPM_NAME = "python310-azure-mgmt-policyinsights-1.1.0b4-1.4.noarch.rpm"
RPM_HASH = "794be2144b69352976970ab6e6f1cc04c23753417a2db6128c2d4f91c7058b0bbbce97f03e5f7a47c4420671020874d80c1429795387b921fb610cf4d6750c57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-policyinsights \
python310-azure-mgmt-policyinsights \
python3dist-azure-mgmt-policyinsights"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
