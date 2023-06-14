SUMMARY = "C++ interface for pango"
DESCRIPTION = "pangomm provides a C++ interface to the pango library."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "2.46.3"

RPM_NAME = "libpangomm-1_4-1-2.46.3-2.3.aarch64.rpm"
RPM_HASH = "2c34ad1c0c88788797d914dedc34c3a34f48c1b415579be862dbdcd87e0adfa0b6fe4c10dba3aecd557bbbfd8e90a64621263f6655faabd3866c0e67aea652f8"

RPROVIDES:${PN} += "libpangomm-1-4-1 \
libpangomm-1.4.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairomm-1.0.so.1 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgobject-2.0.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libsigc-2.0.so.0 \
libstdc++.so.6"

inherit rpm
