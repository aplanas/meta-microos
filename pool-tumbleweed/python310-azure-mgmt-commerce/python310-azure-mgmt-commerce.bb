SUMMARY = "Microsoft Azure Commerce Client Library"
DESCRIPTION = "This is the Microsoft Azure Commerce Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "6.0.0"

RPM_NAME = "python310-azure-mgmt-commerce-6.0.0-1.10.noarch.rpm"
RPM_HASH = "ce4f3a236a4f88bcc4de5c0f32288ee867e0fb498322bfc5c8dad076e77921cd18d1aa5707c3d348d7c1417f8708eca92026eff98c20f883c1121fa322c64f53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-commerce \
python3.10dist(azure-mgmt-commerce) \
python310-azure-mgmt-commerce \
python3dist(azure-mgmt-commerce)"

RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg"

inherit rpm
