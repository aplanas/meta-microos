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

RPM_NAME = "python310-blosc2-2.2.6-1.1.aarch64.rpm"
RPM_HASH = "5e4d0aef6788f83d3dadfcec1b95ecf5622c2f1feecdd99694d0cb187c7ce849532e2ea6ccbc2a65aaeea9e9a3f4fe34961c4ff08623412a760960936712f21a"

RPROVIDES:${PN} += "python3.10dist-blosc2 \
python310-blosc2 \
python3dist-blosc2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblosc2.so.2 \
libc.so.6 \
python-abi \
python310-msgpack \
python310-ndindex \
python310-numpy \
python310-py-cpuinfo"

inherit rpm
