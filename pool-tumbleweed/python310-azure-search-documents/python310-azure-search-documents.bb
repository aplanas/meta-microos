SUMMARY = "Microsoft Azure Service Bus Runtime Client Library"
DESCRIPTION = "This is the Microsoft Azure Service Bus Client Library. \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7. \
 \
Microsoft Azure Service Bus supports a set of cloud-based, message-oriented \
middleware technologies including reliable message queuing and durable \
publish/subscribe messaging."
LICENSE = "Apache-2.0"

PV = "11.3.0"

RPM_NAME = "python310-azure-search-documents-11.3.0-1.4.noarch.rpm"
RPM_HASH = "eb3324a578bfebec5dd96ecf1234a46d40382e2754d1c54579571d17d60cc7b0ab4141481feb5c3a3a2657a82daa23ce94a0bc8cc494a222ebb16e9bceff6a8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-search-documents \
python310-azure-search-documents \
python3dist-azure-search-documents"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-core \
python310-azure-nspkg \
python310-azure-search-nspkg \
python310-msrest \
python310-typing-extensions"

inherit rpm
