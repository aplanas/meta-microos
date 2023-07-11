SUMMARY = "Microsoft Azure MyService Management Client Library"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-mgmt-datashare-1.0.0.0-1.14.noarch.rpm"
RPM_HASH = "002f445720a6401200421f2246e1a416a5babcba15954dcbae1914918086bf1f10a7b830a261fb1754f89606ae557e1603c8eb6df1e7261721e04160c0a1d836"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-datashare \
python310-azure-mgmt-datashare \
python3dist-azure-mgmt-datashare"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
