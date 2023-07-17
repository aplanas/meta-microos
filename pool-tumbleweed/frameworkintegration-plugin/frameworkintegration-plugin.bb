SUMMARY = "Plugins responsible for better integration of Qt applications in KDE Workspace"
DESCRIPTION = "Framework Integration is a set of plugins responsible for better \
integration of Qt applications when running on a \
KDE Plasma workspace. \
 \
Applications do not need to link to this directly."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "frameworkintegration-plugin-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "f1df5106041d9ccb68a7d5421543ce9bf748f5e5331c79a694aec7d902a46330c58ef1bd10c3e9fa80a2a8e2ac6d1cdfa1e4d18c804b088806fd0840e9355f66"

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
