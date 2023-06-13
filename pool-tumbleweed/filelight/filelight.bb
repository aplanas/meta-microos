SUMMARY = "Graphical disk usage viewer"
DESCRIPTION = "Filelight creates an interactive visualization of disk usage \
and the sizes of files and directories on the system."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "23.04.1"

RPM_NAME = "filelight-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "0748d45e6f1ce94c6d3849292e75607f31887d9b51c485dd91554359276223f1c950efc263eb7372b928586b4769e41db9dcef711aa060d802c9585a688e30ae"

RPROVIDES:${PN} += "application() \
application(org.kde.filelight.desktop) \
config(filelight) \
filelight \
filelight(aarch-64) \
filelight5 \
metainfo() \
metainfo(org.kde.filelight.appdata.xml) \
mimehandler(inode/directory)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOGui.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5QuickControls2.so.5()(64bit) \
libQt5QuickControls2.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit)"

inherit rpm
