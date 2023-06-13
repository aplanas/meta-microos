SUMMARY = "Widgets for configuration dialogs: Build Environment"
DESCRIPTION = "KConfigWidgets provides easy-to-use classes to create configuration dialogs, as \
well as a set of widgets which uses KConfig to store their settings. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kconfigwidgets-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "7a4473414814b823be7272e2746a58f99128f2c3dc7f32e61b7f8360473669260a387df26d5106eb9b6c80cbfb2359a4f6a3ca2143bb849dd07cc00fdd9d2954"

RPROVIDES:${PN} += "cmake(KF5ConfigWidgets) \
kconfigwidgets-devel \
kconfigwidgets-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/perl \
cmake(KF5Auth) \
cmake(KF5Codecs) \
cmake(KF5Config) \
cmake(KF5WidgetsAddons) \
extra-cmake-modules \
ld-linux-aarch64.so.1()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5ConfigWidgets5 \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
