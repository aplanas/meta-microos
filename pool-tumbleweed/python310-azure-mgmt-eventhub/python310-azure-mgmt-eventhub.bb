SUMMARY = "Microsoft Azure EventHub Management Client Library"
DESCRIPTION = "This is the Microsoft Azure EventHub Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "11.0.0"

RPM_NAME = "python310-azure-mgmt-eventhub-11.0.0-1.1.noarch.rpm"
RPM_HASH = "de1898601294dce0dc04a9ba7700fe5e32303237401535062edd768b336d7e4ca18485a171bda02c407ec42fb5491f05754d3c8affbe0e2bbd4d78ece103e2c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-eventhub \
python3.10dist(azure-mgmt-eventhub) \
python310-azure-mgmt-eventhub \
python3dist(azure-mgmt-eventhub)"

RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) \
python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
