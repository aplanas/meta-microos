SUMMARY = "Microsoft Azure EventHub Management Client Library"
DESCRIPTION = "This is the Microsoft Azure EventHub Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "11.0.0"

RPM_NAME = "python310-azure-mgmt-eventhub-11.0.0-1.2.noarch.rpm"
RPM_HASH = "1c3894b0a715ac5387731c548c551dc93177c56e83a868b7e0d3d266fdda5afa496de8ffb7c0bdd55aa973988f8420d78b8022a3d2dd02b1e8586a4684865c10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-eventhub \
python310-azure-mgmt-eventhub \
python3dist-azure-mgmt-eventhub"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
