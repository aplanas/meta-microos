SUMMARY = "Plugins responsible for better integration of Qt applications in KDE Workspace"
DESCRIPTION = "Framework Integration is a set of plugins responsible for better \
integration of Qt applications when running on a \
KDE Plasma workspace. \
 \
Applications do not need to link to this directly."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "frameworkintegration-plugin-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "e72eea42a4db29fe53fa9d22ba43a96152f4222e237ecdbab0b67094605e79db20b86de670614d27d5f3f4b4f802fc1049311ab559140633fb251046edccd5c1"

RPROVIDES:${PN} += "frameworkintegration-plugin frameworkintegration-plugin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libAppStreamQt.so.2()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5NewStuffCore.so.5()(64bit) libKF5Notifications.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libpackagekitqt5.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) plasma5-integration-plugin"

inherit rpm
