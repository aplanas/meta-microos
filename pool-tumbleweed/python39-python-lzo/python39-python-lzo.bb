SUMMARY = "Python bindings for the LZO data compression library"
DESCRIPTION = "This module provides Python bindings for the LZO data compression library. \
 \
LZO is a lossless data compression library. Decompression requires no \
memory. Different compression levels can be used to achieve better \
ratios at the expense of time."
LICENSE = "GPL-2.0-only"

PV = "1.14"

RPM_NAME = "python39-python-lzo-1.14-1.8.aarch64.rpm"
RPM_HASH = "f0f30af36eb4ea0c214aebf3b92e9f24ebd580d2b254416ce2a7284c976a819c9bcc1f5044698e07a522c4411c5e15fa035ceb87a3ead8b4d1038e2d7387a6bc"

RPROVIDES:${PN} += "python3.9dist(python-lzo) \
python39-python-lzo \
python39-python-lzo(aarch-64) \
python3dist(python-lzo)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
liblzo2.so.2()(64bit) \
python(abi)"

inherit rpm
