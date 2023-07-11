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

RPM_NAME = "python311-azure-eventhub-checkpointstoreblob-1.1.4-1.10.noarch.rpm"
RPM_HASH = "f98e4e1425fd0e02c1db350d2f6ad0a9acb5e84d0fd4e39e906ff9dd6e4965454fd9c36ec3f0bc7324da8ba097593ad0309992eba624f529fdb52128cfc6ce7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-eventhub-checkpointstoreblob \
python3.11dist-azure-eventhub-checkpointstoreblob \
python311-azure-eventhub-checkpointstoreblob \
python3dist-azure-eventhub-checkpointstoreblob"

RDEPENDS:${PN} += "python-abi \
python311-azure-core \
python311-azure-eventhub \
python311-azure-nspkg \
python311-cryptography \
python311-msrest"

inherit rpm
