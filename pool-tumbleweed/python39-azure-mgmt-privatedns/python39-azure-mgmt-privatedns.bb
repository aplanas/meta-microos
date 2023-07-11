SUMMARY = "Microsoft Azure DNS Private Zones Client Library"
DESCRIPTION = "This is the Microsoft Azure DNS Private Zones Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python39-azure-mgmt-privatedns-1.1.0-1.2.noarch.rpm"
RPM_HASH = "76798752862ad8e7db66dfd33825f0795a1eba1543681973475350463738d9c8665a5e3cdbae2ad06abe201bd3e35ce67232c6ebd9961718782e735b0ae632da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-privatedns \
python39-azure-mgmt-privatedns \
python3dist-azure-mgmt-privatedns"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
