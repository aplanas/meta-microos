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

RPM_NAME = "python39-azure-eventhub-checkpointstoreblob-aio-1.1.4-1.8.noarch.rpm"
RPM_HASH = "5ab0e693437b593681cb8d25541dae89ba87af8dedd316824dfeb7f52ff1c5505045b0a69142f31121dcd14e621ebe9a43d246809c18bd34eb94b06e2852ffcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-eventhub-checkpointstoreblob-aio) \
python39-azure-eventhub-checkpointstoreblob-aio \
python3dist(azure-eventhub-checkpointstoreblob-aio)"
RDEPENDS:${PN} += "python(abi) \
python39-aiohttp \
python39-azure-core \
python39-azure-eventhub \
python39-azure-nspkg \
python39-azure-storage-blob \
python39-cryptography \
python39-msrest"

inherit rpm
