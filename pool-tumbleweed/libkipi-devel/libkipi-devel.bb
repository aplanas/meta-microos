SUMMARY = "KDE Image Plugin Interface"
DESCRIPTION = "This package provides a generic KDE Image Plug-in Interface used by \
some KDE image applications. Plug-ins for this interface are in the \
kipi-plugins package."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "23.08.0"

RPM_NAME = "libkipi-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "862a4a9c29cdefaf35483e602597976617c74d7bd0edbf542589aa35e863cda7628b2a87115e9af0c2f1cac8096e58588d852f39a6b205fc0fb560cb3e7379f2"

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
