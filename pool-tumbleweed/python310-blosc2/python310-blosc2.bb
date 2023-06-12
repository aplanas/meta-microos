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

RPM_NAME = "python310-blosc2-2.2.2-1.1.aarch64.rpm"
RPM_HASH = "06d9a0883e5bb0e9076053b4220d49ecd84787c367e28a6d21470eb23671308986928ef3f03d8f882de6ffb125f4d89be4e1849122212d22462061a4dd1e3751"

RPROVIDES:${PN} += "python3-blosc2 \
python3.10dist(blosc2) \
python310-blosc2 \
python310-blosc2(aarch-64) \
python3dist(blosc2)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libblosc2.so.2()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python310-msgpack \
python310-ndindex \
python310-numpy \
python310-py-cpuinfo \
python310-rich"

inherit rpm
