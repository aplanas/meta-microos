SUMMARY = "Qt 6 SQL related library"
DESCRIPTION = "A Qt 6 library which is used for connection with an SQL server. You \
will need also a plugin package for a supported SQL server."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "libQt6Sql6-6.5.1-4.1.aarch64.rpm"
RPM_HASH = "4801387434e835ff62f2c353e37bc92650ef6f9616d92865a2c1b927ad7e48ed0dd7927942349fe0b014c16a771e58b55d6eccd87554b820f4cd2c993377b56b"

RPROVIDES:${PN} += "libQt6Sql.so.6 \
libQt6Sql6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
