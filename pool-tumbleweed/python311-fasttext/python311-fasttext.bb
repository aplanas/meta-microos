SUMMARY = "Library for fast text representation and classification"
DESCRIPTION = "fastText is a library for efficient learning of word \
representations and sentence classification."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "python311-fasttext-0.9.2-4.3.aarch64.rpm"
RPM_HASH = "26f29956caf4b3c10e19fcc59bcb367bb57f2158219753fd4ddcc86b96ee7c9412255a474e9518ffe02084c8a7d1c104a8b90b58b3d2854f76931cf332e3c3b7"

RPROVIDES:${PN} += "python3-fasttext \
python3.11dist-fasttext \
python311-fasttext \
python3dist-fasttext"

RDEPENDS:${PN} += "/usr/bin/sh \
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
