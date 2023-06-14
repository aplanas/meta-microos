SUMMARY = "Plugins responsible for better integration of Qt applications in KDE Workspace"
DESCRIPTION = "Framework Integration is a set of plugins responsible for better \
integration of Qt applications when running on a \
KDE Plasma workspace. \
 \
Applications do not need to link to this directly."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "frameworkintegration-plugin-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "efe5e2aa4affa4fbd07d04888feb2c4c9ecacb5debbdc2ad6354228c948acb8a9cb5b563e919fe6a517c798dd4b10ba2cb704ea7e33c994853d497f46979c1ed"

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
