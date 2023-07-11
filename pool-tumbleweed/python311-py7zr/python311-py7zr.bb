SUMMARY = "Library and utility to support 7zip"
DESCRIPTION = "py7zr is a library and utility to support 7zip archive compression, decompression, encryption and decryption written by Python programming language."
LICENSE = "LGPL-2.1-or-later"

PV = "0.20.5"

RPM_NAME = "python311-py7zr-0.20.5-2.1.noarch.rpm"
RPM_HASH = "ad54c9e8e83bad5a2dba29f677d4d3661d83676c50f75f2fb5f7d7cfb391df023606f3a39604f3982d28d9d808ecd59fab477b8d9aacdfd5ad1f29ac5ab7eaf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-py7zr \
python3.11dist-py7zr \
python311-py7zr \
python3dist-py7zr"

RDEPENDS:${PN} += "-python311-pyppmd >= 0.18.1 with python311-pyppmd < 1.1.0 \
/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Brotli \
python311-inflate64 \
python311-multivolumefile \
python311-psutil \
python311-pybcj \
python311-pycryptodomex \
python311-pyzstd \
python311-texttable \
update-alternatives"

inherit rpm
