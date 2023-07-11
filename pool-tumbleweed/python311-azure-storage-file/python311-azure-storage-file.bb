SUMMARY = "Microsoft Azure Storage File Client Library for Python"
DESCRIPTION = "This project provides a client library in Python that makes it easy to \
consume Microsoft Azure Storage services. For documentation please see \
the Microsoft Azure `Python Developer Center`_ and our `API Reference`_ \
Page."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python311-azure-storage-file-2.1.0-2.17.noarch.rpm"
RPM_HASH = "f4127328578aa9af93df6148439f8f998a69513a544adda50f757c0cd550356db05feedaadde397a02afb6ebb989b5e167d0043ae43c64fce4e7f4b8793b0dce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-storage-file \
python3.11dist-azure-storage-file \
python311-azure-storage-file \
python3dist-azure-storage-file"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-nspkg \
python311-azure-storage-common \
python311-azure-storage-nspkg"

inherit rpm
