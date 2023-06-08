SUMMARY = "New control center for Linux Deepin"
DESCRIPTION = "The deepin-control-center is the control panel of Deepin Desktop."
LICENSE = "LGPL-3.0-or-later"

PV = "5.5.143"

RPM_NAME = "deepin-control-center-5.5.143-1.7.aarch64.rpm"
RPM_HASH = "50bf99bb91f72fe830009c57e9e74519a54751e7d92570d37245f1e7ba3510a05f5e081fad716e0a3377f7a93f2dbccae66033c9702837aa07c56927a698b944"

RPROVIDES:${PN} += "application() application(dde-control-center.desktop) deepin-control-center deepin-control-center(aarch-64) libdccwidgets.so()(64bit)"
RDEPENDS:${PN} += "/bin/bash deepin-account-faces deepin-api deepin-daemon deepin-start ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Concurrent.so.5()(64bit) libQt5Concurrent.so.5(Qt_5)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Gui.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Multimedia.so.5()(64bit) libQt5Multimedia.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Svg.so.5()(64bit) libQt5Svg.so.5(Qt_5)(64bit) libQt5WaylandClient.so.5()(64bit) libQt5WaylandClient.so.5(Qt_5)(64bit) libQt5WaylandClient.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypt.so.1()(64bit) libcrypt.so.1(XCRYPT_2.0)(64bit) libdareader.so.1()(64bit) libdeepin_pw_check.so.1()(64bit) libdeepin_pw_check1 libdframeworkdbus.so.2()(64bit) libdtkcore.so.5()(64bit) libdtkgui.so.5()(64bit) libdtkwidget.so.5()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgsettings-qt.so.1()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpolkit-qt5-core-1.so.1()(64bit) libqt5-qdbus libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libwayland-client.so.0()(64bit) qt5integration redshift"

inherit rpm
