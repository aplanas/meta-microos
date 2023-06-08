SUMMARY = "A user-friendly system monitor"
DESCRIPTION = "deepin-system-monitor is a simple process and system monitor for the Deepin \
Desktop."
LICENSE = "GPL-3.0-or-later"

PV = "5.8.27"

RPM_NAME = "deepin-system-monitor-5.8.27-1.4.aarch64.rpm"
RPM_HASH = "764e16e9997091bb520e86a8c31f8c5ebde3bb67fa8d2945026b8f5f54cdf3e5cec3afe22a9e12f36883c1ce2a8bbb957295c08ba560b69834b520021bbf4e5c"

RPROVIDES:${PN} += "application() application(deepin-system-monitor.desktop) deepin-system-monitor deepin-system-monitor(aarch-64) metainfo() metainfo(deepin-system-monitor.appdata.xml)"
RDEPENDS:${PN} += "/usr/bin/pkexec hicolor-icon-theme ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Concurrent.so.5()(64bit) libQt5Concurrent.so.5(Qt_5)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libdtkcore.so.5()(64bit) libdtkgui.so.5()(64bit) libdtkwidget.so.5()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libicui18n.so.72()(64bit) libicuuc.so.72()(64bit) libnl-3.so.200()(64bit) libnl-3.so.200(libnl_3)(64bit) libnl-route-3.so.200()(64bit) libnl-route-3.so.200(libnl_3)(64bit) libnl-route-3.so.200(libnl_3_2_29)(64bit) libpcap.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libudev.so.1()(64bit) libudev.so.1(LIBUDEV_183)(64bit) libudev.so.1(LIBUDEV_196)(64bit) libxcb-icccm.so.4()(64bit) libxcb.so.1()(64bit) qt5integration"

inherit rpm
