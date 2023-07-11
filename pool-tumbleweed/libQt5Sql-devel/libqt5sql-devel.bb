SUMMARY = "Development files for the Qt5 SQL library"
DESCRIPTION = "Qt 5 libraries which are used for connection with an SQL server. You \
will need also a plugin package for a supported SQL server."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5Sql-devel-5.15.10+kde129-1.1.aarch64.rpm"
RPM_HASH = "6c3b767dccdb9a44406bd519e21c4cb04690fea80a70ed898b2e261b2c6ba83097728a0592898fe0c7e9b8b1d283b0ad1ec13bb69ff5e272cb06224265458c5e"

RPROVIDES:${PN} += "cmake-Qt5Sql \
libQt5Sql-devel \
pkgconfig-Qt5Sql"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Core-devel \
libQt5Sql5 \
pkgconfig-Qt5Core"

inherit rpm
