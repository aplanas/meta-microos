SUMMARY = "Library and utility to support 7zip"
DESCRIPTION = "py7zr is a library and utility to support 7zip archive compression, decompression, encryption and decryption written by Python programming language."
LICENSE = "LGPL-2.1-or-later"

PV = "0.20.5"

RPM_NAME = "python311-py7zr-0.20.5-1.1.noarch.rpm"
RPM_HASH = "f5a59e8294d5a3a0615ccdf68caa588ec0e1686aa162544af0a62c5cd014e086293fe0549dcebd0925a150981fac3c213cef537a3c5429392c874a2fb41631fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-py7zr \
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
