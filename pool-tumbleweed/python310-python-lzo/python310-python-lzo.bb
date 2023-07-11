SUMMARY = "Python bindings for the LZO data compression library"
DESCRIPTION = "This module provides Python bindings for the LZO data compression library. \
 \
LZO is a lossless data compression library. Decompression requires no \
memory. Different compression levels can be used to achieve better \
ratios at the expense of time."
LICENSE = "GPL-2.0-only"

PV = "1.14"

RPM_NAME = "python310-python-lzo-1.14-1.10.aarch64.rpm"
RPM_HASH = "bb775487131aec9e03bb20fcc5db1951b066351ae6dd02614e1857aa081b2067bac7aba5a13608f0fdb02c7648a0a915b54925271e7cdef3c72871e9357fa4da"

RPROVIDES:${PN} += "python3.10dist-python-lzo \
python310-python-lzo \
python3dist-python-lzo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblzo2.so.2 \
python-abi"

inherit rpm
