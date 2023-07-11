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

RPM_NAME = "python39-blosc2-2.2.2-1.2.aarch64.rpm"
RPM_HASH = "a19f257703de69ba0f746e70a6bb7fee3697ce586f4137ee2d79664b709acfee2ce6da149a9405e2c344fe1cc2b83f4d216bfaba016d023c0c2068c1e01da621"

RPROVIDES:${PN} += "python3.9dist-blosc2 \
python39-blosc2 \
python3dist-blosc2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblosc2.so.2 \
libc.so.6 \
python-abi \
python39-msgpack \
python39-ndindex \
python39-numpy \
python39-py-cpuinfo \
python39-rich"

inherit rpm
