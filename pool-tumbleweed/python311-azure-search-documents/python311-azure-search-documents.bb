SUMMARY = "Microsoft Azure Service Bus Runtime Client Library"
DESCRIPTION = "This is the Microsoft Azure Service Bus Client Library. \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7. \
 \
Microsoft Azure Service Bus supports a set of cloud-based, message-oriented \
middleware technologies including reliable message queuing and durable \
publish/subscribe messaging."
LICENSE = "Apache-2.0"

PV = "11.3.0"

RPM_NAME = "python311-azure-search-documents-11.3.0-1.4.noarch.rpm"
RPM_HASH = "cbf4f695fd676f05e794d90112cae5de34f2f6c2fc9f5b18fdf2bb9877652ae495290926a84a280d8a89c313ae0bab7c465f495b8aa0c87ec5ebed89a7ce225f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-search-documents \
python3.11dist-azure-search-documents \
python311-azure-search-documents \
python3dist-azure-search-documents"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-core \
python311-azure-nspkg \
python311-azure-search-nspkg \
python311-msrest \
python311-typing-extensions"

inherit rpm
