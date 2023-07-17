SUMMARY = "Widgets for configuration dialogs: Build Environment"
DESCRIPTION = "KConfigWidgets provides easy-to-use classes to create configuration dialogs, as \
well as a set of widgets which uses KConfig to store their settings. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kconfigwidgets-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "24cefc3ca30d8451772125d7a68ec30474dfddb23c05aa74c252ff23524bc6d2c6c8495547cbca3db7b7e419bc6f420ae8410c4413439e55cf6655bb2bf8a991"

RPROVIDES:${PN} += "cmake-KF5ConfigWidgets \
kconfigwidgets-devel"

RDEPENDS:${PN} += "/usr/bin/perl \
cmake-KF5Auth \
cmake-KF5Codecs \
cmake-KF5Config \
cmake-KF5WidgetsAddons \
extra-cmake-modules \
ld-linux-aarch64.so.1 \
libKF5ConfigWidgets.so.5 \
libKF5ConfigWidgets5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
