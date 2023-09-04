SUMMARY = "Widgets for configuration dialogs: Build Environment"
DESCRIPTION = "KConfigWidgets provides easy-to-use classes to create configuration dialogs, as \
well as a set of widgets which uses KConfig to store their settings. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kconfigwidgets-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "4a5202923ad137b03363b1559221a5043b9060c72da405611ebc46615614e08c836795c8be8ad3519372650723210d39238cab6b569df70cd097bdccf7b0817e"

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
