SUMMARY = "Microsoft Azure Storage Common Client Library for Python"
DESCRIPTION = "This project provides a client library in Python that makes it easy to \
consume Microsoft Azure Storage services. For documentation please see \
the Microsoft Azure `Python Developer Center`_ and our `API Reference`_ \
Page."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python311-azure-storage-common-2.1.0-2.13.noarch.rpm"
RPM_HASH = "5929b8cb4dc6ab1d8dd490527243f3d8cd042044ea4873391f288565e84561fd9fbffd2129af749dfbd26820023f592c349346869727e1d645a8c7f0e6bf6771"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-storage-common \
python3.11dist-azure-storage-common \
python311-azure-storage-common \
python3dist-azure-storage-common"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-nspkg \
python311-azure-storage-nspkg \
python311-cryptography \
python311-python-dateutil \
python311-requests"

inherit rpm
