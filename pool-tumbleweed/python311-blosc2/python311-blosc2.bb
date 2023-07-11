SUMMARY = "Python wrapper for the C-Blosc2 library"
DESCRIPTION = "Blosc (https://blosc.org) is a high performance compressor optimized \
for binary data. It has been designed to transmit data to the processor \
cache faster than the traditional, non-compressed, direct memory fetch \
approach via a memcpy() OS call. \
 \
Blosc works well for compressing numerical arrays that contains data \
with relatively low entropy, like sparse data, time series, grids with \
regular-spaced values, etc. \
 \
python-blosc2 is a Python package that wraps C-Blosc2, the newest version \
of the Blosc compressor. Currently python-blosc2 already reproduces the \
API of python-blosc, so the former can be used as a drop-in replacement \
for the later."
LICENSE = "BSD-3-Clause"

PV = "2.2.2"

RPM_NAME = "python311-blosc2-2.2.2-1.2.aarch64.rpm"
RPM_HASH = "1e242e0a7529032ed99ffad3d1f56cbd5e4aa8fe5fdcd7350799c122d36b2740124c1b1b36f9c628391af78b31cb932046e6990ed80a3f0abdac876fd23d7c93"

RPROVIDES:${PN} += "python3-blosc2 \
python3.11dist-blosc2 \
python311-blosc2 \
python3dist-blosc2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblosc2.so.2 \
libc.so.6 \
python-abi \
python311-msgpack \
python311-ndindex \
python311-numpy \
python311-py-cpuinfo \
python311-rich"

inherit rpm
