SUMMARY = "Reference C implementation of the LZFSE compressor"
DESCRIPTION = "LZFSE is a Lempel-Ziv style data compression algorithm using Finite State \
Entropy coding. It targets similar compression rates at higher compression \
and decompression speed compared to deflate using zlib."
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "lzfse-1.0-2.11.aarch64.rpm"
RPM_HASH = "046edb5d66f9ae219e8e5b76e6ffe98eb90123d85f3be30f26041b9acb0ead0949fd13a53aa100f0ad5b8beec22e8396d442cb58aaf308174a1f98923fc0751a"

RPROVIDES:${PN} += "liblzfse.so \
lzfse"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
