SUMMARY = "Development files for the Qt5 SQL library"
DESCRIPTION = "Qt 5 libraries which are used for connection with an SQL server. You \
will need also a plugin package for a supported SQL server."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5Sql-devel-5.15.10+kde129-2.1.aarch64.rpm"
RPM_HASH = "f228439c05c0b819ba93b344207c232d0df482274730b29725c9a92d252e8a40f1c7dfeb47d2a75ae7c0de94cb9e06dbe50846f3bad9bc1a66fbd9af60342882"

RPROVIDES:${PN} += "cmake-Qt5Sql \
libQt5Sql-devel \
pkgconfig-Qt5Sql"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Core-devel \
libQt5Sql5 \
pkgconfig-Qt5Core"

inherit rpm
