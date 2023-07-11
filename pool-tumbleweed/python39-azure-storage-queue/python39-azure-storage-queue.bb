SUMMARY = "Microsoft Azure Storage Queue Client Library for Python"
DESCRIPTION = "This project provides a client library in Python that makes it easy to \
consume Microsoft Azure Storage services. For documentation please see \
the Microsoft Azure `Python Developer Center`_ and our `API Reference`_ \
Page."
LICENSE = "MIT"

PV = "12.6.0"

RPM_NAME = "python39-azure-storage-queue-12.6.0-1.4.noarch.rpm"
RPM_HASH = "90488916386b2b2d5aa53fa6de9169542d3dd264186e2a0744e593259032eb08c7b2b222f32acb7cb18eaf51331a931f796572a3211ef175474dd22f5b71f873"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-storage-queue \
python39-azure-storage-queue \
python3dist-azure-storage-queue"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-core \
python39-azure-nspkg \
python39-azure-storage-common \
python39-azure-storage-nspkg \
python39-cryptography \
python39-isodate"

inherit rpm
