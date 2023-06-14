SUMMARY = "Library for the Microsoft Works text and spreadsheet formats"
DESCRIPTION = "libwps is a library for importing the Microsoft Works word processor \
and spreadsheet file format."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.4.13"

RPM_NAME = "libwps-0_4-4-0.4.13-1.3.aarch64.rpm"
RPM_HASH = "31fae8b783fc30f3f1bfce796f76c81721c452a120d0dcfc1ce6d815152b0b79b80d71f3be4d3992d047428ce5558495e0fdc2c0412559e74e9927a589e4e37e"

RPROVIDES:${PN} += "libwps-0-4-4 \
libwps-0.4.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
librevenge-0.0.so.0 \
libstdc++.so.6"

inherit rpm
