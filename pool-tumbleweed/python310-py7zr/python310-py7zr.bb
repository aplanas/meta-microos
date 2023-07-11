SUMMARY = "Library and utility to support 7zip"
DESCRIPTION = "py7zr is a library and utility to support 7zip archive compression, decompression, encryption and decryption written by Python programming language."
LICENSE = "LGPL-2.1-or-later"

PV = "0.20.5"

RPM_NAME = "python310-py7zr-0.20.5-2.1.noarch.rpm"
RPM_HASH = "22fc179a532165ea182cb43014b99b60c1e6e4067a682170848d31b6fe54d1d25466a852c1d9d94516c7e7dc6fec39c41288e4f92dc3d45ad59f5950d43f36cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-py7zr \
python310-py7zr \
python3dist-py7zr"

RDEPENDS:${PN} += "-python310-pyppmd >= 0.18.1 with python310-pyppmd < 1.1.0 \
/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Brotli \
python310-inflate64 \
python310-multivolumefile \
python310-psutil \
python310-pybcj \
python310-pycryptodomex \
python310-pyzstd \
python310-texttable \
update-alternatives"

inherit rpm
