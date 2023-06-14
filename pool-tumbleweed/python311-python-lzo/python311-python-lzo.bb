SUMMARY = "Python bindings for the LZO data compression library"
DESCRIPTION = "This module provides Python bindings for the LZO data compression library. \
 \
LZO is a lossless data compression library. Decompression requires no \
memory. Different compression levels can be used to achieve better \
ratios at the expense of time."
LICENSE = "GPL-2.0-only"

PV = "1.14"

RPM_NAME = "python311-python-lzo-1.14-1.8.aarch64.rpm"
RPM_HASH = "df7d74958742af69a6df6140d2844e42b4dc3c29166f3243901f003a95e805075d50d4ba6c94b2e0cdc62359cc3195ab46b6ecc3e10c31be1950e7b64a645365"

RPROVIDES:${PN} += "python3.11dist-python-lzo \
python311-python-lzo \
python3dist-python-lzo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblzo2.so.2 \
python-abi"

inherit rpm
