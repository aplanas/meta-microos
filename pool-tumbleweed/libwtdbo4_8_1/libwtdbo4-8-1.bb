SUMMARY = "Wt::Dbo ORM library and Sqlite3 back-end"
DESCRIPTION = "This package contains the Wt::Dbo Object-Relational Mapping library \
and Sqlite3 back-end of it."
LICENSE = "GPL-2.0-only"

PV = "4.8.1"

RPM_NAME = "libwtdbo4_8_1-4.8.1-3.8.aarch64.rpm"
RPM_HASH = "b6decd38f3df746fbecff26e95661131e1f0711dc976a12cfaf04d11ece6c87209b071f4c090c9f381ef3d9a98fc2f2ddf61ec4d9b79a1eb0f84c61c46dad5fb"

RPROVIDES:${PN} += "libwtdbo.so.4.8.1 \
libwtdbo4-8-1 \
libwtdbosqlite3.so.4.8.1 \
wt-dbo"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libsqlite3.so.0 \
libstdc++.so.6"

inherit rpm
