SUMMARY = "Microsoft Azure Service Bus Runtime Client Library"
DESCRIPTION = "This is the Microsoft Azure Service Bus Client Library. \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7. \
 \
Microsoft Azure Service Bus supports a set of cloud-based, message-oriented \
middleware technologies including reliable message queuing and durable \
publish/subscribe messaging."
LICENSE = "Apache-2.0"

PV = "7.11.0"

RPM_NAME = "python310-azure-servicebus-7.11.0-1.1.noarch.rpm"
RPM_HASH = "13347ca894e8e151c5b8cce8349d4141930204b16eaa344d0c2f6407a18d7c33994adc10ed65b4e1e1bf45dad295dd4866549579d5d2d81cf66152c1735aa0d3"
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
