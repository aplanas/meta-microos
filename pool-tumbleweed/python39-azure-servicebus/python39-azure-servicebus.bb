SUMMARY = "Microsoft Azure Service Bus Runtime Client Library"
DESCRIPTION = "This is the Microsoft Azure Service Bus Client Library. \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7. \
 \
Microsoft Azure Service Bus supports a set of cloud-based, message-oriented \
middleware technologies including reliable message queuing and durable \
publish/subscribe messaging."
LICENSE = "Apache-2.0"

PV = "7.11.1"

RPM_NAME = "python39-azure-servicebus-7.11.1-1.1.noarch.rpm"
RPM_HASH = "86cd86ae2d7dcc5d1c5571813cadabbc1e3d6711f64ab48f0d6109cdff7b37cd495be62f7752c738fd25c9f3cc151c7d41d300c8b33470b838b928aa928cff97"
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
