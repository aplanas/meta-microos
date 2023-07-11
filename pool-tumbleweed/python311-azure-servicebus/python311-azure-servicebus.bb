SUMMARY = "Microsoft Azure Service Bus Runtime Client Library"
DESCRIPTION = "This is the Microsoft Azure Service Bus Client Library. \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7. \
 \
Microsoft Azure Service Bus supports a set of cloud-based, message-oriented \
middleware technologies including reliable message queuing and durable \
publish/subscribe messaging."
LICENSE = "Apache-2.0"

PV = "7.11.0"

RPM_NAME = "python311-azure-servicebus-7.11.0-1.1.noarch.rpm"
RPM_HASH = "c814e87cb7373a32a8c9a0bebc7b842de362768573a0716ca6f013b7c9402be2f70fd86473fb1e308b18a2ec7ac97e05a591e6a17db4be167848a0f5eef80e6a"
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
