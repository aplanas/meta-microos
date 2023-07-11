SUMMARY = "Tools for converting the Microsoft Works text and spreadsheet formats"
DESCRIPTION = "Tools to work with the Microsoft Works word processor and spreadsheet \
file format, based on libwps."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.4.14"

RPM_NAME = "libwps-tools-0.4.14-1.1.aarch64.rpm"
RPM_HASH = "7895f8bd01eaecdb96bc32c15be3376e18d77bc063e94b91305630a789a112365d25b7aded9e8aeee4712d9f8b3a4a4795b0fb09759c62be6f3f2f010227c974"

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
