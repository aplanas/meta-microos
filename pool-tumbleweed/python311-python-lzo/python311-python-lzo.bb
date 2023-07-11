SUMMARY = "Python bindings for the LZO data compression library"
DESCRIPTION = "This module provides Python bindings for the LZO data compression library. \
 \
LZO is a lossless data compression library. Decompression requires no \
memory. Different compression levels can be used to achieve better \
ratios at the expense of time."
LICENSE = "GPL-2.0-only"

PV = "1.14"

RPM_NAME = "python311-python-lzo-1.14-1.10.aarch64.rpm"
RPM_HASH = "631a287fcc6e61f5095a5cead6ac4209ead34e860831b6de304eedce8283a4f40247107dd55b7edf95d8641244b2aeb549972770b1cb08144229e076a7682a3c"

RPROVIDES:${PN} += "python3-python-lzo \
python3.11dist-python-lzo \
python311-python-lzo \
python3dist-python-lzo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblzo2.so.2 \
python-abi"

inherit rpm
