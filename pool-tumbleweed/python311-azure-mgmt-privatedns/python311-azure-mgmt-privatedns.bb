SUMMARY = "Microsoft Azure DNS Private Zones Client Library"
DESCRIPTION = "This is the Microsoft Azure DNS Private Zones Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-azure-mgmt-privatedns-1.1.0-1.1.noarch.rpm"
RPM_HASH = "8e3e6fbceef3f4fb4d8b5b9646a7873fb77707b4f00bc51620d8295913e880b10ef570800ba0cfae1e9b2aab0d3dc95879abf5cc067ffeb9ce8d280a271f07fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-mgmt-privatedns \
python311-azure-mgmt-privatedns \
python3dist-azure-mgmt-privatedns"

RDEPENDS:${PN} += "-python311-typing-extensions >= 4.3.0 if python311-base < 3.8 \
python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
