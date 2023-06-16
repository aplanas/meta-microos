SUMMARY = "Library and utility to support 7zip"
DESCRIPTION = "py7zr is a library and utility to support 7zip archive compression, decompression, encryption and decryption written by Python programming language."
LICENSE = "LGPL-2.1-or-later"

PV = "0.20.5"

RPM_NAME = "python39-py7zr-0.20.5-1.1.noarch.rpm"
RPM_HASH = "b4a3f6900570963d5192137c8e28c6c4db92e5834de89b13ffcc8ade0e23621a95f8e81ac080ce5e6bc03064b63f6b227708aefe075cfc62f95be3684ce21343"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-py7zr \
python39-py7zr \
python3dist-py7zr"

RDEPENDS:${PN} += "-python39-pyppmd >= 0.18.1 with python39-pyppmd < 1.1.0 \
/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Brotli \
python39-inflate64 \
python39-multivolumefile \
python39-psutil \
python39-pybcj \
python39-pycryptodomex \
python39-pyzstd \
python39-texttable \
update-alternatives"

inherit rpm
