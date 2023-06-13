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

RPM_NAME = "python39-blosc2-2.2.2-1.1.aarch64.rpm"
RPM_HASH = "046f3435ad4e2a22893c9f487f8f7fd63b1d6e68733743b00c984356dfc6794f1dcf65e9b14204223d71d71fbaf129de7b2965fe5b7ac94c27f6883cc8de8685"

RPROVIDES:${PN} += "python3.9dist(blosc2) \
python39-blosc2 \
python39-blosc2(aarch-64) \
python3dist(blosc2)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libblosc2.so.2()(64bit) \
libc.so.6()(64bit) \
python(abi) \
python39-msgpack \
python39-ndindex \
python39-numpy \
python39-py-cpuinfo \
python39-rich"

inherit rpm
