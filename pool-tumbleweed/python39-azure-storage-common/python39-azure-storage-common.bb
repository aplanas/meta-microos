SUMMARY = "Microsoft Azure Storage Common Client Library for Python"
DESCRIPTION = "This project provides a client library in Python that makes it easy to \
consume Microsoft Azure Storage services. For documentation please see \
the Microsoft Azure `Python Developer Center`_ and our `API Reference`_ \
Page."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python39-azure-storage-common-2.1.0-2.13.noarch.rpm"
RPM_HASH = "c6a781724148f034026b8ee2c13804f47d0db4921d8bf0cd84de1774c61a43a343724b8d9469eb919f2212b3d0577716c161f02ca4ea0853f32fc6cec4db3d37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-storage-common \
python39-azure-storage-common \
python3dist-azure-storage-common"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-nspkg \
python39-azure-storage-nspkg \
python39-cryptography \
python39-python-dateutil \
python39-requests"

inherit rpm
