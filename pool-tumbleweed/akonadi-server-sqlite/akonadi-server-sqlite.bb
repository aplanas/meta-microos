SUMMARY = "akonadi server's SQlite plugin"
DESCRIPTION = "Akonadi server's SQlite plugin."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "akonadi-server-sqlite-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "340a22a04c0120a8df2d2cd610d6dc6dc161eef58df2395871965b5e761cebc174def2d1b67c63ff4dfe2be148cfb2b4a1cdc809a582607b4889859a1bf0f4b0"

RPROVIDES:${PN} += "akonadi-server-sqlite \
libqsqlite3.so"

RDEPENDS:${PN} += "akonadi-server \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Sql.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libsqlite3.so.0 \
libstdc++.so.6"

inherit rpm
