SUMMARY = "Development files for the Qt5 base library"
DESCRIPTION = "You need this package if you want to compile programs with Qt. It \
contains the 'Qt Crossplatform Development Kit'. It does contain \
include files and development applications like GUI designers, \
translator tools and code generators."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libqt5-qtbase-devel-5.15.10+kde129-2.1.aarch64.rpm"
RPM_HASH = "4798e79fcd377fcecb8bbe559cc1cb00d4dd93e50fff6da09e40ae1f84c145aeadd48da2f9bc58fc362760a1b30994d4d903304cc981c5c6ff09623cb6cfe205"

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
