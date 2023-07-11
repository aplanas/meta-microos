SUMMARY = "Compact C Type Format library (runtime, BFD dependency)"
DESCRIPTION = "This package includes the libctf shared library. \
The Compact C Type Format (CTF) is a way of representing information about a binary program"
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "libctf0-2.40-5.3.aarch64.rpm"
RPM_HASH = "85982f86c46a80dbd8f6cc6adbb7de0ad797e0381f8d3c4c7a52483df7129bc683acf55e773b74dea5b95927fec0abd575bf20b6654b04d61f79868a60215384"

RPROVIDES:${PN} += "libctf.so.0 \
libctf0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfd-2.40.0.20230412-5.so \
libc.so.6 \
libz.so.1"

inherit rpm
