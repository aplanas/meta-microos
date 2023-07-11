SUMMARY = "Microsoft Azure Storage File Client Library for Python"
DESCRIPTION = "This project provides a client library in Python that makes it easy to \
consume Microsoft Azure Storage services. For documentation please see \
the Microsoft Azure `Python Developer Center`_ and our `API Reference`_ \
Page."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python310-azure-storage-file-2.1.0-2.17.noarch.rpm"
RPM_HASH = "eb4c654db26146b79045a856d608d13ab7bce7e80857b128d5068751c0e8c277ff5a6246307ff4082250af0c9430a8c017966ed59bbfd54cb591e7425bbfd4ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-storage-file \
python310-azure-storage-file \
python3dist-azure-storage-file"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-nspkg \
python310-azure-storage-common \
python310-azure-storage-nspkg"

inherit rpm
