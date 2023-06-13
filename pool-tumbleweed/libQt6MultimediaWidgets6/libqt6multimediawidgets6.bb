SUMMARY = "Qt 6 MultimediaWidgets library"
DESCRIPTION = "The Qt 6 MultimediaWidgets library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6MultimediaWidgets6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "072834dccc6e02ac4ca4bce06888fc07558dd638eb46d2894a8972e4cc7b761f5ffdbf6289795f3192bf8d653981225a4d18d925184ced8832dddc3c1b12df6e"

RPROVIDES:${PN} += "libQt6MultimediaWidgets.so.6()(64bit) \
libQt6MultimediaWidgets.so.6(Qt_6)(64bit) \
libQt6MultimediaWidgets6 \
libQt6MultimediaWidgets6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Multimedia.so.6()(64bit) \
libQt6Multimedia.so.6(Qt_6)(64bit) \
libQt6Widgets.so.6()(64bit) \
libQt6Widgets.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
