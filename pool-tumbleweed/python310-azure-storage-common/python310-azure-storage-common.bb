SUMMARY = "Microsoft Azure Storage Common Client Library for Python"
DESCRIPTION = "This project provides a client library in Python that makes it easy to \
consume Microsoft Azure Storage services. For documentation please see \
the Microsoft Azure `Python Developer Center`_ and our `API Reference`_ \
Page."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python310-azure-storage-common-2.1.0-2.11.noarch.rpm"
RPM_HASH = "90d9074d2f4cf5fd86aac7f1dea2a32939886c4c7b9a32a3d2fdee25d13f5732a6ec9caa63e2ef1f3f523f6dfbe7cf256f2bd9533511570881065201cdb57fe3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-storage-common \
python3.10dist-azure-storage-common \
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
