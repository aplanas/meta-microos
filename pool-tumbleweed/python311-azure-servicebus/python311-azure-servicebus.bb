SUMMARY = "Microsoft Azure Service Bus Runtime Client Library"
DESCRIPTION = "This is the Microsoft Azure Service Bus Client Library. \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7. \
 \
Microsoft Azure Service Bus supports a set of cloud-based, message-oriented \
middleware technologies including reliable message queuing and durable \
publish/subscribe messaging."
LICENSE = "Apache-2.0"

PV = "7.11.1"

RPM_NAME = "python311-azure-servicebus-7.11.1-1.1.noarch.rpm"
RPM_HASH = "2980e253474c91a6122635a3a6a3812b4134c4cd4f3ae6550cda9a7edba23c3abaa8a7c70a4c4a404791ee1204ffb22a06305e310f5a79c2d6072075b1dafb3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-servicebus \
python3.11dist-azure-servicebus \
python311-azure-servicebus \
python3dist-azure-servicebus"

RDEPENDS:${PN} += "python-abi \
python311-azure-core \
python311-azure-nspkg \
python311-isodate \
python311-typing-extensions"

inherit rpm
