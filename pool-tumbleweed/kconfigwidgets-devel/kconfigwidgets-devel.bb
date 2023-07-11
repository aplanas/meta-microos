SUMMARY = "Widgets for configuration dialogs: Build Environment"
DESCRIPTION = "KConfigWidgets provides easy-to-use classes to create configuration dialogs, as \
well as a set of widgets which uses KConfig to store their settings. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kconfigwidgets-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "9640e8b41f5d725241f87e19884a267863aa158496931aebbce5ae11f76834bffb5ae526031c6133bebee96d5d2309402ec8c800b7b3619ad26ed2069f929f8e"

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
