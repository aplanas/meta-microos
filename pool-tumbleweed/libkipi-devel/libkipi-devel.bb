SUMMARY = "KDE Image Plugin Interface"
DESCRIPTION = "This package provides a generic KDE Image Plug-in Interface used by \
some KDE image applications. Plug-ins for this interface are in the \
kipi-plugins package."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "23.04.3"

RPM_NAME = "libkipi-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "673c10f648535d3e1fdc698b8ffc6409a72ca2def38b6588918e5311e270a1c2c4c7f02d911db1ff1cb39ae7f256976fb94138b1cd8486e4868cb6b4ebf37646"

RPROVIDES:${PN} += "cmake-KF5Kipi \
libkipi-devel \
libkipi-kf5-devel"

RDEPENDS:${PN} += "cmake-KF5Config \
cmake-KF5I18n \
cmake-KF5Service \
cmake-KF5XmlGui \
cmake-Qt5Core \
cmake-Qt5Gui \
cmake-Qt5Widgets \
libKF5Kipi32-0-0"

inherit rpm
