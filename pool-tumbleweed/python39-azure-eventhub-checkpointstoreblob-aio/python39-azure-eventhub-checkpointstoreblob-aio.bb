SUMMARY = "Azure EventHubs Checkpoint Store client library for Python using Storage Blobs"
DESCRIPTION = "Azure EventHubs Checkpoint Store is used for storing checkpoints while processing events \
from Azure Event Hubs. This Checkpoint Store package works as a plug-in package to \
EventHubConsumerClient. It uses Azure Storage Blob as the persistent store for maintaining \
checkpoints and partition ownership information. \
 \
Please note that this is an async library, for sync version of the Azure EventHubs Checkpoint \
Store client library, please refer to the package azure-eventhub-checkpointstoreblob."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "python39-azure-eventhub-checkpointstoreblob-aio-1.1.4-1.10.noarch.rpm"
RPM_HASH = "a7de10e0e21a78c702adadb01a6f3f5940c15a4a0f3b424fe29844dfd048cb64f8df15ea7bbd18b5a2deb3d11e723fa090f56ad9bc3eb25c97a764612fa2a9a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-eventhub-checkpointstoreblob-aio \
python39-azure-eventhub-checkpointstoreblob-aio \
python3dist-azure-eventhub-checkpointstoreblob-aio"

RDEPENDS:${PN} += "python-abi \
python39-aiohttp \
python39-azure-core \
python39-azure-eventhub \
python39-azure-nspkg \
python39-azure-storage-blob \
python39-cryptography \
python39-msrest"

inherit rpm
