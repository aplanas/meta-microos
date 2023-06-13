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

RPM_NAME = "python39-azure-eventhub-checkpointstoreblob-1.1.4-1.8.noarch.rpm"
RPM_HASH = "139a80982da178aa61ba2c2a3155a2e4ce0f483005d7ab4bce0e4c6d1451f321429f4742657e40ad8d8bcfd2b53558b08e39ab5171c5b12b4131981535da0504"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-eventhub-checkpointstoreblob) \
python39-azure-eventhub-checkpointstoreblob \
python3dist(azure-eventhub-checkpointstoreblob)"

RDEPENDS:${PN} += "python(abi) \
python39-azure-core \
python39-azure-eventhub \
python39-azure-nspkg \
python39-cryptography \
python39-msrest"

inherit rpm
