SUMMARY = "Qt 6 SQL related library"
DESCRIPTION = "A Qt 6 library which is used for connection with an SQL server. You \
will need also a plugin package for a supported SQL server."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6Sql6-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "6f3d1f2f809b9811bcc0745847c2a6d047985bc7b237c830191cf551636d34e93ef91bfd3a0daa1607fd71931c2e774037b5dc6a98b7e7489759f8c323b7a62e"

RPROVIDES:${PN} += "libQt6Sql.so.6 \
libQt6Sql6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
