SUMMARY = "C++ wrapper around SQLite 3.x"
DESCRIPTION = "wxSQLite3 is a C++ wrapper around the public domain SQLite 3.x database \
and is specifically designed for use in programs based on the wxWidgets \
library."
LICENSE = "SUSE-wxWidgets-3.1"

PV = "4.9.1"

RPM_NAME = "libwxcode_gtk2u_wxsqlite3-3_2-0-4.9.1-1.4.aarch64.rpm"
RPM_HASH = "1cb8c79b3ddb04a2a7c8c4b17279d7afec3ca36c7aaa40ee35796c0bce98a22162c3c301e546c8980aabf2bb100921ba67564cae73f72d237bc18f8095430c4d"

RPROVIDES:${PN} += "libwxcode_gtk2u_wxsqlite3-3.2.so.0()(64bit) \
libwxcode_gtk2u_wxsqlite3-3_2-0 \
libwxcode_gtk2u_wxsqlite3-3_2-0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libwx_baseu-suse.so.9.0.0()(64bit) \
libwx_gtk2u_core-suse.so.9.0.0()(64bit)"

inherit rpm
