SUMMARY = "Microsoft Azure Storage File Client Library for Python"
DESCRIPTION = "This project provides a client library in Python that makes it easy to \
consume Microsoft Azure Storage services. For documentation please see \
the Microsoft Azure `Python Developer Center`_ and our `API Reference`_ \
Page."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python39-azure-storage-file-2.1.0-2.15.noarch.rpm"
RPM_HASH = "861b8427138a6cf74d2e4c6430b7ad10e54f66c06975e8edfc53b6ea6676301f5bc0c379319ce2d941077b8fa09fc2f0fda8bc239b0f9f13b3fd14338d27df47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-storage-file) \
python39-azure-storage-file \
python3dist(azure-storage-file)"

RDEPENDS:${PN} += "python(abi) \
python39-azure-common \
python39-azure-nspkg \
python39-azure-storage-common \
python39-azure-storage-nspkg"

inherit rpm
