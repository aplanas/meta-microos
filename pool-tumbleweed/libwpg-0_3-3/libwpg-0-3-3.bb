SUMMARY = "Library to read and parse graphics in WordPerfect Graphics format"
DESCRIPTION = "libwpg is a C++ library to read and parse graphics in WPG (WordPerfect \
Graphics) format."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.3.4"

RPM_NAME = "libwpg-0_3-3-0.3.4-2.2.aarch64.rpm"
RPM_HASH = "ad12118a2270f4ab801ed08691dc9c77162574ef2ad21a55201bbbc2be71e8b3618ea5654d3bc6f6f500d4e0bf9c4c7a81911bedfb2d0080346c57fc0d6d13cf"

RPROVIDES:${PN} += "libwpg-0-3-3 \
libwpg-0.3.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
librevenge-0.0.so.0 \
libstdc++.so.6 \
libwpd-0.10.so.10"

inherit rpm
