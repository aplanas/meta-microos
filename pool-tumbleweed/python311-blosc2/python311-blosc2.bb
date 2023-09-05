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

PV = "2.2.6"

RPM_NAME = "python311-blosc2-2.2.6-1.1.aarch64.rpm"
RPM_HASH = "d46a929fc4b94fa53f361fbce3e0878c2d18d80d6510ff434100d2f5ecb4b6967b956fef9935b998ff97027dea8a135935d2e4ea6a0dba8244a292e7584b5718"

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
python311-py-cpuinfo"

inherit rpm
