SUMMARY = "Microsoft Azure Storage File Client Library for Python"
DESCRIPTION = "This project provides a client library in Python that makes it easy to \
consume Microsoft Azure Storage services. For documentation please see \
the Microsoft Azure `Python Developer Center`_ and our `API Reference`_ \
Page."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python39-azure-storage-file-2.1.0-2.17.noarch.rpm"
RPM_HASH = "adc4ab100ccf896da3affe265ec9403e0bbd642780af524fff2092dad3358732299942c0f64597822ba1d2ebe6f9212f552c71c70f574ff1611595edfc0a044f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-storage-file \
python39-azure-storage-file \
python3dist-azure-storage-file"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-nspkg \
python39-azure-storage-common \
python39-azure-storage-nspkg"

inherit rpm
