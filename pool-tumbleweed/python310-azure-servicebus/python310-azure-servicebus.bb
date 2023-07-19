SUMMARY = "Microsoft Azure Service Bus Runtime Client Library"
DESCRIPTION = "This is the Microsoft Azure Service Bus Client Library. \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7. \
 \
Microsoft Azure Service Bus supports a set of cloud-based, message-oriented \
middleware technologies including reliable message queuing and durable \
publish/subscribe messaging."
LICENSE = "Apache-2.0"

PV = "7.11.1"

RPM_NAME = "python310-azure-servicebus-7.11.1-1.1.noarch.rpm"
RPM_HASH = "e6f5e4709357d9fbc77f38c690bd8f050521c182b36196dc2b7cd76558f77cd714f78e42b6f2f1233d7ed49bc457a7c849363302c0b1184dea14779e03589370"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-servicebus \
python310-azure-servicebus \
python3dist-azure-servicebus"

RDEPENDS:${PN} += "python-abi \
python310-azure-core \
python310-azure-nspkg \
python310-isodate \
python310-typing-extensions"

inherit rpm
