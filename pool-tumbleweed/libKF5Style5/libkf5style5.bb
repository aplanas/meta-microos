SUMMARY = "Plugins responsible for better integration of Qt applications in KDE Workspace"
DESCRIPTION = "Framework Integration is a set of plugins responsible for better \
integration of Qt applications when running on a \
KDE Plasma workspace. \
 \
Applications do not need to link to this directly."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5Style5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "63d871b0df1ba841e78920e175bb2720bff09b660e3794ad62d015ba8e01ff76f86714e2aa3bfe460bdf1a1ed678acdb8ba22ca20fd5df705e1885a158f67a28"

RPROVIDES:${PN} += "libKF5Style.so.5 \
libKF5Style5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5IconThemes.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
