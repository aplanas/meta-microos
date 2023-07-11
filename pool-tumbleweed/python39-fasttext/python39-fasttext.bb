SUMMARY = "Library for fast text representation and classification"
DESCRIPTION = "fastText is a library for efficient learning of word \
representations and sentence classification."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "python39-fasttext-0.9.2-4.3.aarch64.rpm"
RPM_HASH = "102578f1dfdf1b9a6286b618db8283443403541b89445d565b97e4b8f44b525e32ac37fac307673108b3204041ce9717889c3b8a78f777b5679db7332a79210b"

RPROVIDES:${PN} += "python3.9dist-fasttext \
python39-fasttext \
python3dist-fasttext"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python39-numpy \
python39-pybind11 \
python39-setuptools \
update-alternatives"

inherit rpm
