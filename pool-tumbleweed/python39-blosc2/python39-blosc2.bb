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

RPM_NAME = "python39-blosc2-2.2.6-1.1.aarch64.rpm"
RPM_HASH = "10492f95fdb1ec04c64fe73a2228402222f5f19edd0de51f12798e87aeefedb23978fb17c73b3f578bc3363aa46a70c7247ff0da470aff875a67001d5085b7a5"

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
python39-py-cpuinfo"

inherit rpm
