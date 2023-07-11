SUMMARY = "Microsoft Azure Storage Queue Client Library for Python"
DESCRIPTION = "This project provides a client library in Python that makes it easy to \
consume Microsoft Azure Storage services. For documentation please see \
the Microsoft Azure `Python Developer Center`_ and our `API Reference`_ \
Page."
LICENSE = "MIT"

PV = "12.6.0"

RPM_NAME = "python310-azure-storage-queue-12.6.0-1.4.noarch.rpm"
RPM_HASH = "1935f83e33a4961f62c99d6fd66ac2f2c3777f614834fe57264237d7824293e1356d74b9aae20910054aff56bef5dfb241b8f348b083e819086366883b1ca9d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-storage-queue \
python310-azure-storage-queue \
python3dist-azure-storage-queue"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-core \
python310-azure-nspkg \
python310-azure-storage-common \
python310-azure-storage-nspkg \
python310-cryptography \
python310-isodate"

inherit rpm
