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

RPM_NAME = "python39-azure-eventhub-checkpointstoreblob-1.1.4-1.10.noarch.rpm"
RPM_HASH = "82c9d2a0d64ee7177cfe512b8f9639442c410a49e9645056da2575918c83239fba6089633b50cb907cece5fe706811cb2dba881d8173788057ceb9ea23e889bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-eventhub-checkpointstoreblob \
python39-azure-eventhub-checkpointstoreblob \
python3dist-azure-eventhub-checkpointstoreblob"

RDEPENDS:${PN} += "python-abi \
python39-azure-core \
python39-azure-eventhub \
python39-azure-nspkg \
python39-cryptography \
python39-msrest"

inherit rpm
