SUMMARY = "Development files for the Qt5 print support library"
DESCRIPTION = "Development files for the Qt5 print support library."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5PrintSupport-devel-5.15.10+kde129-2.1.aarch64.rpm"
RPM_HASH = "ca3e402024ca5d20d6ab9ca96f445533747120e0fcbcd74f2cf0dd0d687abc22cc312d184c12256f8c81aaacccc6eea9b6d58b45a0e1c5d12937860a0862da9c"

RPROVIDES:${PN} += "cmake-Qt5PrintSupport \
libQt5PrintSupport-devel \
pkgconfig-Qt5PrintSupport"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Core-devel \
libQt5Gui-devel \
libQt5PrintSupport5 \
libQt5Widgets-devel \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-Qt5Widgets"

inherit rpm
