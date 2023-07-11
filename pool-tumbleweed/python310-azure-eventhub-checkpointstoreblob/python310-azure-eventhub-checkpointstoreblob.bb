SUMMARY = "Azure EventHubs Checkpoint Store client library for Python using Storage Blobs"
DESCRIPTION = "Azure EventHubs Checkpoint Store is used for storing checkpoints while processing events \
from Azure Event Hubs. This Checkpoint Store package works as a plug-in package to \
EventHubConsumerClient. It uses Azure Storage Blob as the persistent store for maintaining \
checkpoints and partition ownership information. \
 \
Please note that this is a sync library, for async version of the Azure EventHubs Checkpoint \
Store client library, please refer to the package azure-eventhub-checkpointstoreblob-aio."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "python310-azure-eventhub-checkpointstoreblob-1.1.4-1.10.noarch.rpm"
RPM_HASH = "ad95bb6bbccb5b9dd677d6fb6eab3c682d98d3e42c6ff4ca34927a8397f43208cc6b095ee8eb8d146f7be592533a34e8cbef47f832486a414d0e90013e7509f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-eventhub-checkpointstoreblob \
python310-azure-eventhub-checkpointstoreblob \
python3dist-azure-eventhub-checkpointstoreblob"

RDEPENDS:${PN} += "python-abi \
python310-azure-core \
python310-azure-eventhub \
python310-azure-nspkg \
python310-cryptography \
python310-msrest"

inherit rpm
