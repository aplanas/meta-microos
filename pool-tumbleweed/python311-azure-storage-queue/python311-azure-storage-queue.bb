SUMMARY = "Microsoft Azure Storage Queue Client Library for Python"
DESCRIPTION = "This project provides a client library in Python that makes it easy to \
consume Microsoft Azure Storage services. For documentation please see \
the Microsoft Azure `Python Developer Center`_ and our `API Reference`_ \
Page."
LICENSE = "MIT"

PV = "12.6.0"

RPM_NAME = "python311-azure-storage-queue-12.6.0-1.4.noarch.rpm"
RPM_HASH = "b6a941cb0a7a6d395d4aa2ca377419f2437681bccb26790274c15eabd006d147417f86bb2d00d04b6e51316ac06c789655d31b19736b26b105623672c102257a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-storage-queue \
python3.11dist-azure-storage-queue \
python311-azure-storage-queue \
python3dist-azure-storage-queue"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-core \
python311-azure-nspkg \
python311-azure-storage-common \
python311-azure-storage-nspkg \
python311-cryptography \
python311-isodate"

inherit rpm
