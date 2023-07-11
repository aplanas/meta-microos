SUMMARY = "Plugins responsible for better integration of Qt applications in KDE Workspace"
DESCRIPTION = "Framework Integration is a set of plugins responsible for better \
integration of Qt applications when running on a \
KDE Plasma workspace. \
 \
Applications do not need to link to this directly."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "frameworkintegration-plugin-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "b07e8ac7803fc5fa0b48f47671097f98aff55d945f79ff69c6e1b370902d34c812178cf39b0a27c00ef8dad01a22e959571a21f0068cc4c49afa24a68a49a622"

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
