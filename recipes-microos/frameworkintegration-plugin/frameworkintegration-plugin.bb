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

RPROVIDES:${PN} += "frameworkintegration-plugin \
frameworkintegration-plugin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libAppStreamQt.so.2()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5NewStuffCore.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libpackagekitqt5.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
plasma5-integration-plugin"

inherit rpm
