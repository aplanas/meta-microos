SUMMARY = "Microsoft Azure Service Bus Runtime Client Library"
DESCRIPTION = "This is the Microsoft Azure Service Bus Client Library. \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7. \
 \
Microsoft Azure Service Bus supports a set of cloud-based, message-oriented \
middleware technologies including reliable message queuing and durable \
publish/subscribe messaging."
LICENSE = "Apache-2.0"

PV = "11.3.0"

RPM_NAME = "python311-azure-search-documents-11.3.0-1.3.noarch.rpm"
RPM_HASH = "36bd507a6e820d7f9b32f1309000320e55f7bfe2815dabd60aba41391fe136c8c53f1d02887b6e98e5ad3df2a0d925ff7657e78d9103cb43c00ccebbd0716381"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-search-documents) \
python311-azure-search-documents \
python3dist(azure-search-documents)"

RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-core \
python311-azure-nspkg \
python311-azure-search-nspkg \
python311-msrest \
python311-typing_extensions"

inherit rpm
