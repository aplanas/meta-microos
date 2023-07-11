SUMMARY = "Python bindings for the LZO data compression library"
DESCRIPTION = "This module provides Python bindings for the LZO data compression library. \
 \
LZO is a lossless data compression library. Decompression requires no \
memory. Different compression levels can be used to achieve better \
ratios at the expense of time."
LICENSE = "GPL-2.0-only"

PV = "1.14"

RPM_NAME = "python39-python-lzo-1.14-1.10.aarch64.rpm"
RPM_HASH = "cfd2f6347ca3b4f5957e23ca0af50ad71111aa4fc78daf905752a02df12cb28a0e3aebc841bee45efef8de513a45e7736e51dd89041d6735e80449292345b168"

RPROVIDES:${PN} += "python3.9dist-python-lzo \
python39-python-lzo \
python3dist-python-lzo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblzo2.so.2 \
python-abi"

inherit rpm
