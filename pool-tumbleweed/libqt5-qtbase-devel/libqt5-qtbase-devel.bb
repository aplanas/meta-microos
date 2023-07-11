SUMMARY = "Development files for the Qt5 base library"
DESCRIPTION = "You need this package if you want to compile programs with Qt. It \
contains the 'Qt Crossplatform Development Kit'. It does contain \
include files and development applications like GUI designers, \
translator tools and code generators."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libqt5-qtbase-devel-5.15.10+kde129-1.1.aarch64.rpm"
RPM_HASH = "9f1c5e8bb9682ccd212b3f93e98baacb4b8efe1c29dc2cf4f06556100f4567ffd4684703b911e0edd2cca9817fa6766b29961f30234a6af86b00c8d81ca14eb6"

RPROVIDES:${PN} += "libqt5-qtbase-devel"

RDEPENDS:${PN} += "libQt5Concurrent-devel \
libQt5Core-devel \
libQt5DBus-devel \
libQt5Gui-devel \
libQt5Network-devel \
libQt5OpenGL-devel \
libQt5PlatformHeaders-devel \
libQt5PrintSupport-devel \
libQt5Sql-devel \
libQt5Test-devel \
libQt5Widgets-devel \
libQt5Xml-devel \
libqt5-qtbase-common-devel"

inherit rpm
