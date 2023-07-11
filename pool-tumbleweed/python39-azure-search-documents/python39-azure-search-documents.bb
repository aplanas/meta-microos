SUMMARY = "Microsoft Azure Service Bus Runtime Client Library"
DESCRIPTION = "This is the Microsoft Azure Service Bus Client Library. \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7. \
 \
Microsoft Azure Service Bus supports a set of cloud-based, message-oriented \
middleware technologies including reliable message queuing and durable \
publish/subscribe messaging."
LICENSE = "Apache-2.0"

PV = "11.3.0"

RPM_NAME = "python39-azure-search-documents-11.3.0-1.4.noarch.rpm"
RPM_HASH = "93285a32e69941265421d128ab4dd20f4642f4032c24e7e53ca6e5b7dbcc067953e40620198e1f69ac91500c9fcb73a1d5665aaffe207859be24d8a37371afc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-search-documents \
python39-azure-search-documents \
python3dist-azure-search-documents"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-core \
python39-azure-nspkg \
python39-azure-search-nspkg \
python39-msrest \
python39-typing-extensions"

inherit rpm
