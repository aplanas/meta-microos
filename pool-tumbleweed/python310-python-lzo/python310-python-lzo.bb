SUMMARY = "Python bindings for the LZO data compression library"
DESCRIPTION = "This module provides Python bindings for the LZO data compression library. \
 \
LZO is a lossless data compression library. Decompression requires no \
memory. Different compression levels can be used to achieve better \
ratios at the expense of time."
LICENSE = "GPL-2.0-only"

PV = "1.14"

RPM_NAME = "python310-python-lzo-1.14-1.8.aarch64.rpm"
RPM_HASH = "dab1cc9c7d55928926cf5a3e55ca2ef78ec33d6b6d931fee12406d452ca20e95a0f5a67e8dddad98cb2f37ae6a9aff3771852ec63eaca9821b223373771cd1cd"

RPROVIDES:${PN} += "python3-python-lzo \
python3.10dist-python-lzo \
python310-python-lzo \
python3dist-python-lzo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblzo2.so.2 \
python-abi"

inherit rpm
