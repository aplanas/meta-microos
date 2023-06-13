SUMMARY = "C++ interface for pango"
DESCRIPTION = "pangomm provides a C++ interface to the pango library."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "2.46.3"

RPM_NAME = "libpangomm-1_4-1-2.46.3-2.3.aarch64.rpm"
RPM_HASH = "2c34ad1c0c88788797d914dedc34c3a34f48c1b415579be862dbdcd87e0adfa0b6fe4c10dba3aecd557bbbfd8e90a64621263f6655faabd3866c0e67aea652f8"

RPROVIDES:${PN} += "libpangomm-1.4.so.1()(64bit) \
libpangomm-1_4-1 \
libpangomm-1_4-1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairomm-1.0.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libglibmm-2.4.so.1()(64bit) \
libgobject-2.0.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libsigc-2.0.so.0()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
