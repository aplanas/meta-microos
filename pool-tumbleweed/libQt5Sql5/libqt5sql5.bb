SUMMARY = "Qt 5 SQL related libraries"
DESCRIPTION = "Qt 5 libraries which are used for connection with an SQL server. You \
will need also a plugin package for a supported SQL server."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde154"

RPM_NAME = "libQt5Sql5-5.15.9+kde154-1.2.aarch64.rpm"
RPM_HASH = "d32bda2bd4390dfa80371de6f28357fec0853a3fcb5e77295add9b9ff8912d9759981423464d138aada0b60f34e194a0186de7282087f0d29f4cf9db676e1733"

RPROVIDES:${PN} += "libQt5Sql.so.5 \
libQt5Sql5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
