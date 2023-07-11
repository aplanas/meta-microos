SUMMARY = "Microsoft Azure API Management Client Library"
DESCRIPTION = "This is the Microsoft Azure API Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python311-azure-mgmt-apimanagement-4.0.0-1.2.noarch.rpm"
RPM_HASH = "4c5d457d14ce86f0ef133f0fea860b5ffb3badfbbc9ba85383188b180e542ee441fc228e92d2464a0ab5bb65e29732b615f804ff09fccee189161a0696a9dcc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-apimanagement \
python3.11dist-azure-mgmt-apimanagement \
python311-azure-mgmt-apimanagement \
python3dist-azure-mgmt-apimanagement"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
