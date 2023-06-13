SUMMARY = "Microsoft Azure Service Bus Runtime Client Library"
DESCRIPTION = "This is the Microsoft Azure Service Bus Client Library. \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7. \
 \
Microsoft Azure Service Bus supports a set of cloud-based, message-oriented \
middleware technologies including reliable message queuing and durable \
publish/subscribe messaging."
LICENSE = "Apache-2.0"

PV = "7.10.0"

RPM_NAME = "python310-azure-servicebus-7.10.0-1.1.noarch.rpm"
RPM_HASH = "8b7549159ca6782ade8b23a34672fce59316ad94566c33e91b67f1dc56ff85d8a3d7fb3b716cf1d501d599d2efafcf56a3512dfdcc5f5dbe2609bde0a1193abb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-servicebus \
python3.10dist(azure-servicebus) \
python310-azure-servicebus \
python3dist(azure-servicebus)"

RDEPENDS:${PN} += "python(abi) \
python310-azure-core \
python310-azure-nspkg \
python310-isodate \
python310-typing_extensions"

inherit rpm
