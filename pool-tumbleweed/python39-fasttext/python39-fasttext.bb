SUMMARY = "Library for fast text representation and classification"
DESCRIPTION = "fastText is a library for efficient learning of word \
representations and sentence classification."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "python39-fasttext-0.9.2-4.1.aarch64.rpm"
RPM_HASH = "a6d805a804c7e81884725449c090b8349304359a95966ccfa7ac28f4455a3c4688aafc657305d9bbf273cfb7a860eef90a2ebad6fa58cc95f6847f2101d0a9e3"

RPROVIDES:${PN} += "python3.9dist-fasttext \
python39-fasttext \
python3dist-fasttext"

RDEPENDS:${PN} += "/bin/sh \
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
