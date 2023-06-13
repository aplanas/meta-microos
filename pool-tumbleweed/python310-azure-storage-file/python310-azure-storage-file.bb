SUMMARY = "Microsoft Azure Storage File Client Library for Python"
DESCRIPTION = "This project provides a client library in Python that makes it easy to \
consume Microsoft Azure Storage services. For documentation please see \
the Microsoft Azure `Python Developer Center`_ and our `API Reference`_ \
Page."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python310-azure-storage-file-2.1.0-2.15.noarch.rpm"
RPM_HASH = "4dc96b5babf7f18af39074d74953bea61c39a5480e2e5eb60bda7afd8b1500a6ab778021e0aa3a59f208a599ea809356267c8c2aa82281c33bbf927580ea4816"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-storage-file \
python3.10dist(azure-storage-file) \
python310-azure-storage-file \
python3dist(azure-storage-file)"

RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-nspkg \
python310-azure-storage-common \
python310-azure-storage-nspkg"

inherit rpm
