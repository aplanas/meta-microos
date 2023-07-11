SUMMARY = "Microsoft Azure DNS Management Client Library"
DESCRIPTION = "This is the Microsoft Azure DNS Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "8.1.0"

RPM_NAME = "python39-azure-mgmt-dns-8.1.0-1.1.noarch.rpm"
RPM_HASH = "8250a3cb316398e186e6b8b762b170a990506265c34e45e78a5e4b62faf9c844c0c05775c7d9dcef1508b23ed444715410f67298186c9c4f294d0e604082df3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-dns \
python39-azure-mgmt-dns \
python3dist-azure-mgmt-dns"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
