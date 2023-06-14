SUMMARY = "Tools for converting the Microsoft Works text and spreadsheet formats"
DESCRIPTION = "Tools to work with the Microsoft Works word processor and spreadsheet \
file format, based on libwps."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.4.13"

RPM_NAME = "libwps-tools-0.4.13-1.3.aarch64.rpm"
RPM_HASH = "26ac116e900813da3b608039dea43c2f8b95badc3a381b9d032f1a5dd7081534b48df86d9e792976c360699556cb86633b134a30c73277d850597cbc0e9a0918"

RPROVIDES:${PN} += "libwps-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
librevenge-0.0.so.0 \
librevenge-generators-0.0.so.0 \
librevenge-stream-0.0.so.0 \
libstdc++.so.6 \
libwps-0.4.so.4"

inherit rpm
