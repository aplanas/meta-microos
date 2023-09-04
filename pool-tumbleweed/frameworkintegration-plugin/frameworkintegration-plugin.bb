SUMMARY = "Plugins responsible for better integration of Qt applications in KDE Workspace"
DESCRIPTION = "Framework Integration is a set of plugins responsible for better \
integration of Qt applications when running on a \
KDE Plasma workspace. \
 \
Applications do not need to link to this directly."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "frameworkintegration-plugin-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "b874fa7eb0a4cacfbe9a0421e8574be3c70262c48bf426d979a311c68453882f5390b1ece9ee4883effdf38751aa91a2cc95e6803f912bd3e4d697a183223cb3"

RPROVIDES:${PN} += "frameworkintegration-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libAppStreamQt.so.2 \
libKF5ConfigCore.so.5 \
libKF5I18n.so.5 \
libKF5NewStuffCore.so.5 \
libKF5Notifications.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libpackagekitqt5.so.1 \
libstdc++.so.6 \
plasma5-integration-plugin"

inherit rpm
