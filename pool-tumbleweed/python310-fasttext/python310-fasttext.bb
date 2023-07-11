SUMMARY = "Library for fast text representation and classification"
DESCRIPTION = "fastText is a library for efficient learning of word \
representations and sentence classification."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "python310-fasttext-0.9.2-4.3.aarch64.rpm"
RPM_HASH = "7e0df2531667043ee9fe2046cbf7a83895b03cdf4dc6b2463acb009a4db6ad5ba55a856e6bc6ae7c083f68ff4d3643e01bc1274d433f3060be67c6a40667fe0f"

RPROVIDES:${PN} += "python3.10dist-fasttext \
python310-fasttext \
python3dist-fasttext"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python310-numpy \
python310-pybind11 \
python310-setuptools \
update-alternatives"

inherit rpm
