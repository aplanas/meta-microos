SUMMARY = "Qt 6 SQL related library"
DESCRIPTION = "A Qt 6 library which is used for connection with an SQL server. You \
will need also a plugin package for a supported SQL server."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "libQt6Sql6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "5f1f22c088c9ed8150dc48f0d20e5d00c27178a8e8a490832f726efeb566ea24596ca7a44490a0c456fe66cc4dc5fc4e49bebbf58c9562b5c01703df70bde799"

RPROVIDES:${PN} += "libQt6Sql.so.6 \
libQt6Sql6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
