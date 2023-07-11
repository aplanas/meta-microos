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

RPM_NAME = "python311-azure-eventhub-checkpointstoreblob-aio-1.1.4-1.10.noarch.rpm"
RPM_HASH = "b44943185e715a7733c8e9b4958704c13560463f8ed21a42ab226528c55696fea3813dbf33d3ad02af81a002da0fb1685334fcad8fadf2be247d39022c197741"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-eventhub-checkpointstoreblob-aio \
python3.11dist-azure-eventhub-checkpointstoreblob-aio \
python311-azure-eventhub-checkpointstoreblob-aio \
python3dist-azure-eventhub-checkpointstoreblob-aio"

RDEPENDS:${PN} += "python-abi \
python311-aiohttp \
python311-azure-core \
python311-azure-eventhub \
python311-azure-nspkg \
python311-azure-storage-blob \
python311-cryptography \
python311-msrest"

inherit rpm
