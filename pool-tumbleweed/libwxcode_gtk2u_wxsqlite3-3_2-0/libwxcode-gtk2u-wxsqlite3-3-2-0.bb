SUMMARY = "C++ wrapper around SQLite 3.x"
DESCRIPTION = "wxSQLite3 is a C++ wrapper around the public domain SQLite 3.x database \
and is specifically designed for use in programs based on the wxWidgets \
library."
LICENSE = "SUSE-wxWidgets-3.1"

PV = "4.9.1"

RPM_NAME = "libwxcode_gtk2u_wxsqlite3-3_2-0-4.9.1-1.5.aarch64.rpm"
RPM_HASH = "8e223bed3456b8b6497b47e09d1dff5c9b38f3f75cadfb2cae52db97be7dc6d3e15c1b716d002b38e8d2015af3368515f5c09bb55c0a27b01808560419b9648b"

RPROVIDES:${PN} += "libwxcode-gtk2u-wxsqlite3-3-2-0 \
libwxcode-gtk2u-wxsqlite3-3.2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0 \
libwx-gtk2u-core-suse.so.9.0.0"

inherit rpm
