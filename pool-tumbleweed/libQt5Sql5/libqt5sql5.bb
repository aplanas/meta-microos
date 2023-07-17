SUMMARY = "Qt 5 SQL related libraries"
DESCRIPTION = "Qt 5 libraries which are used for connection with an SQL server. You \
will need also a plugin package for a supported SQL server."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5Sql5-5.15.10+kde129-2.1.aarch64.rpm"
RPM_HASH = "29c0ca8970e7ff05a4292dcf25f27b47576030edff4bdbae036166c1d5d5f767a4a13de5b7d2661963795ee49fbf66df2ac8d3b8164cdbdb975adaff6a7871cb"

RPROVIDES:${PN} += "libQt5Sql.so.5 \
libQt5Sql5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
