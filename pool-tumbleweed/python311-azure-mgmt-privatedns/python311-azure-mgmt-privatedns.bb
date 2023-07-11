SUMMARY = "Microsoft Azure DNS Private Zones Client Library"
DESCRIPTION = "This is the Microsoft Azure DNS Private Zones Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-azure-mgmt-privatedns-1.1.0-1.2.noarch.rpm"
RPM_HASH = "a2e2a572017023caa8795d2714a00317a6d4c94cfe590075e1a06eec317cb34ed31e448bd4b2b329e753eb6e0701879bf6240a51e6a4dbd859d6b5d9c6adaa97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-privatedns \
python3.11dist-azure-mgmt-privatedns \
python311-azure-mgmt-privatedns \
python3dist-azure-mgmt-privatedns"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
