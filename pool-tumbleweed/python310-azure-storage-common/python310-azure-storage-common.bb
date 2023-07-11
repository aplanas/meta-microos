SUMMARY = "Microsoft Azure Storage Common Client Library for Python"
DESCRIPTION = "This project provides a client library in Python that makes it easy to \
consume Microsoft Azure Storage services. For documentation please see \
the Microsoft Azure `Python Developer Center`_ and our `API Reference`_ \
Page."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python310-azure-storage-common-2.1.0-2.13.noarch.rpm"
RPM_HASH = "0897e0aa608a9d6128b1e6156e4884b26ac3e8d5e0bddffcbdd079721e46374ca4473b1738adf41f330432e4d6fa19d48b1918b47caceebce5779f9296f5b9b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-storage-common \
python310-azure-storage-common \
python3dist-azure-storage-common"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-nspkg \
python310-azure-storage-nspkg \
python310-cryptography \
python310-python-dateutil \
python310-requests"

inherit rpm
