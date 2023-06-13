SUMMARY = "Microsoft Azure Service Bus Runtime Client Library"
DESCRIPTION = "This is the Microsoft Azure Service Bus Client Library. \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7. \
 \
Microsoft Azure Service Bus supports a set of cloud-based, message-oriented \
middleware technologies including reliable message queuing and durable \
publish/subscribe messaging."
LICENSE = "Apache-2.0"

PV = "11.3.0"

RPM_NAME = "python310-azure-search-documents-11.3.0-1.3.noarch.rpm"
RPM_HASH = "c1fc283b305ced9cb98bb41cf9c5a44b9c4fa036531f8ac55a79f50488bce2156364b72c7c2578f98184c5b5169e05aa221737d97876cb6cdf3a350f6567dc9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-search-documents \
python3.10dist(azure-search-documents) \
python310-azure-search-documents \
python3dist(azure-search-documents)"

RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-core \
python310-azure-nspkg \
python310-azure-search-nspkg \
python310-msrest \
python310-typing_extensions"

inherit rpm
