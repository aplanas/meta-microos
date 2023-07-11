SUMMARY = "Microsoft Azure MyService Management Client Library"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-databoxedge-1.0.0.0-1.9.noarch.rpm"
RPM_HASH = "7a3b7e3d745998ca8a2b6583c6479296b738f47c68389b9ce9bebd213b68ed5b75737ba4f7fc0bd2eaee9cde49aff36fa8d6aba4f12c7664a75f6067ada5c207"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-databoxedge \
python39-azure-mgmt-databoxedge \
python3dist-azure-mgmt-databoxedge"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
