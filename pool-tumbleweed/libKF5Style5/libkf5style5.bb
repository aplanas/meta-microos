SUMMARY = "Plugins responsible for better integration of Qt applications in KDE Workspace"
DESCRIPTION = "Framework Integration is a set of plugins responsible for better \
integration of Qt applications when running on a \
KDE Plasma workspace. \
 \
Applications do not need to link to this directly."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5Style5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "6ac4dcfed35ed357e1a6aa6fef7ef89cca04703f2aba78990cce95121e4a3f6b3bce9264bb649e326f2594cd7b1a4a60bcb01918327322b0d2906476689e9d1d"

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
