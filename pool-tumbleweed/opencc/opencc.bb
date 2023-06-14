SUMMARY = "Open Chinese Convert"
DESCRIPTION = "OpenCC is an opensource project for conversion between Traditional \
Chinese and Simplified Chinese, which supports phrase-level conversion \
and regional idioms among Mainland China, Taiwan and Hong kong."
LICENSE = "Apache-2.0"

PV = "1.1.6"

RPM_NAME = "opencc-1.1.6-1.3.aarch64.rpm"
RPM_HASH = "536ca26a99b6336e8c431d49f8a9c5e4748b0d1034bf3eefc01374aca02ed1a328d3412a4d8d1e921ebed245b9b037d57477961dbd688460eb2150d384c32166"

RPROVIDES:${PN} += "opencc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libopencc.so.1.1 \
libstdc++.so.6"

inherit rpm
