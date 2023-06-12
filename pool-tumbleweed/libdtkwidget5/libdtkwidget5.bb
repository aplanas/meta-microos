SUMMARY = "Libraries for dtkwidget"
DESCRIPTION = "The dtkwidget-devel package contains the header files and developer \
docs for dtkcore."
LICENSE = "LGPL-3.0-only"

PV = "5.5.52"

RPM_NAME = "libdtkwidget5-5.5.52-1.7.aarch64.rpm"
RPM_HASH = "8d6fc033672ee449b589ac41eb0c380eebdc01a3e3babee7e62f5f92772c14f84ad1f3e1686efdf8f75d5cfb4cd1ba846622aca2dec9bc2e58f36e440e46bb3e"

RPROVIDES:${PN} += "libdtkwidget.so.5()(64bit) \
libdtkwidget5 \
libdtkwidget5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Core.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Gui.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libXi.so.6()(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libdtkcore.so.5()(64bit) \
libdtkgui.so.5()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgsettings-qt.so.1()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstartup-notification-1.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libxcb-util.so.1()(64bit) \
libxcb.so.1()(64bit)"

inherit rpm
