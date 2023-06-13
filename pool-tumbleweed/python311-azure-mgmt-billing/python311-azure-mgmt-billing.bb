SUMMARY = "Microsoft Azure Billing Client Library"
DESCRIPTION = "This is the Microsoft Azure Billing Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "6.0.0.0"

RPM_NAME = "python311-azure-mgmt-billing-6.0.0.0-1.3.noarch.rpm"
RPM_HASH = "a523f556e1baf8ebd6289a03445394a3b0d8a3537cf384229a6249e930bf4aa50431388028267c20f1781e768bf2a97df4ab8e092a1ac31e404f43acd8fd01be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-billing) \
python311-azure-mgmt-billing \
python3dist(azure-mgmt-billing)"

RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
