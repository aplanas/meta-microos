SUMMARY = "Qt 6 SQL related library"
DESCRIPTION = "A Qt 6 library which is used for connection with an SQL server. You \
will need also a plugin package for a supported SQL server."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6Sql6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "b388acc4c03392a92ff2bd9a2dc48db33b289f4fcca0aa02987bfc68541e8f3b37c21dcff3735fb0053034e7edcad6d975c47963d808f90ab19247484f695f3b"

RPROVIDES:${PN} += "libQt6Sql.so.6 \
libQt6Sql6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
