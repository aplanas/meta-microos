SUMMARY = "Library for fast text representation and classification"
DESCRIPTION = "fastText is a library for efficient learning of word \
representations and sentence classification."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "python311-fasttext-0.9.2-4.1.aarch64.rpm"
RPM_HASH = "cd8a8515e1742a6d54641022bd3839f844b9a12e0880c8f28847748ebf613e2c4b7b0653ab8a8770f0978aa469a11683311285a32b58ddb0c5333c927e787cdb"

RPROVIDES:${PN} += "python3.11dist-fasttext \
python311-fasttext \
python3dist-fasttext"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python311-numpy \
python311-pybind11 \
python311-setuptools \
update-alternatives"

inherit rpm
