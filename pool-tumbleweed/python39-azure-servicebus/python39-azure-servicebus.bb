SUMMARY = "Microsoft Azure Service Bus Runtime Client Library"
DESCRIPTION = "This is the Microsoft Azure Service Bus Client Library. \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7. \
 \
Microsoft Azure Service Bus supports a set of cloud-based, message-oriented \
middleware technologies including reliable message queuing and durable \
publish/subscribe messaging."
LICENSE = "Apache-2.0"

PV = "7.11.0"

RPM_NAME = "python39-azure-servicebus-7.11.0-1.1.noarch.rpm"
RPM_HASH = "79522c4dd208f9580f79eff3d7e19e7b9c56e2fe8d91485964fef3530f5d6305b5a448e091b802ffe05e668f66c054fd4682a18e11e034c2cb116bfe01bb01e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-servicebus \
python39-azure-servicebus \
python3dist-azure-servicebus"

RDEPENDS:${PN} += "python-abi \
python39-azure-core \
python39-azure-nspkg \
python39-isodate \
python39-typing-extensions"

inherit rpm
