SUMMARY = "Plugins responsible for better integration of Qt applications in KDE Workspace"
DESCRIPTION = "Framework Integration is a set of plugins responsible for better \
integration of Qt applications when running on a \
KDE Plasma workspace. \
 \
Applications do not need to link to this directly."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5Style5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "09e84aed554acd97266802572b3c404b96239deb86169ef6afec4af138aa25e9124e6166897907a46a9b43e523796265e11366314bea8c85e5b335981029c685"

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
