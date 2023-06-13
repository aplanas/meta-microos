SUMMARY = "Microsoft Azure Service Bus Runtime Client Library"
DESCRIPTION = "This is the Microsoft Azure Service Bus Client Library. \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7. \
 \
Microsoft Azure Service Bus supports a set of cloud-based, message-oriented \
middleware technologies including reliable message queuing and durable \
publish/subscribe messaging."
LICENSE = "Apache-2.0"

PV = "11.3.0"

RPM_NAME = "python39-azure-search-documents-11.3.0-1.3.noarch.rpm"
RPM_HASH = "ef2aaef46727e13d684ba4355c84a4a789860f1c57794b646048c2608cd728764c5615b534b90a728acf7213405fbad202acfeefccccf7b18805674e96143ed0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-search-documents) \
python39-azure-search-documents \
python3dist(azure-search-documents)"

RDEPENDS:${PN} += "python(abi) \
python39-azure-common \
python39-azure-core \
python39-azure-nspkg \
python39-azure-search-nspkg \
python39-msrest \
python39-typing_extensions"

inherit rpm
