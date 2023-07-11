SUMMARY = "Qt 5 SQL related libraries"
DESCRIPTION = "Qt 5 libraries which are used for connection with an SQL server. You \
will need also a plugin package for a supported SQL server."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5Sql5-5.15.10+kde129-1.1.aarch64.rpm"
RPM_HASH = "0d212a54b3fb131fbbe721d1706a13b10a2cd8c8ef9d5ee34cb9bac51c9861eee7d81b25cdb53b834c004c76b951f391e8f4cae9b1d44eb63670e5fc7dca3609"

RPROVIDES:${PN} += "libQt5Sql.so.5 \
libQt5Sql5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
