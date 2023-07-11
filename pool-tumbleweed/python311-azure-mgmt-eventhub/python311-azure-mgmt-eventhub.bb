SUMMARY = "Microsoft Azure EventHub Management Client Library"
DESCRIPTION = "This is the Microsoft Azure EventHub Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "11.0.0"

RPM_NAME = "python311-azure-mgmt-eventhub-11.0.0-1.2.noarch.rpm"
RPM_HASH = "42fd24a6db66bab9c10f37223368c34a173344b956153f04e28449308e06a183aeaddc218829f83e86345f641cb436ad1ef4adaf4202996495018f260aa33e46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-eventhub \
python3.11dist-azure-mgmt-eventhub \
python311-azure-mgmt-eventhub \
python3dist-azure-mgmt-eventhub"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
