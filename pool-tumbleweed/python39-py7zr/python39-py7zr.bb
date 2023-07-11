SUMMARY = "Library and utility to support 7zip"
DESCRIPTION = "py7zr is a library and utility to support 7zip archive compression, decompression, encryption and decryption written by Python programming language."
LICENSE = "LGPL-2.1-or-later"

PV = "0.20.5"

RPM_NAME = "python39-py7zr-0.20.5-2.1.noarch.rpm"
RPM_HASH = "f9f82b8a6f709237d4c47fd170fad01431a81f2fc421c40b90570fa562ba4456ac2e49d5d794f7dfc2f1c27853c864613ed67bf503c2d556a794d073ddbfac4e"
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
