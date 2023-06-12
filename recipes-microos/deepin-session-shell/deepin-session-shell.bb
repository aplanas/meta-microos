SUMMARY = "Deepin desktop-environment - Session UI Shell"
DESCRIPTION = "This project include those sub-project: \
 \
- deepin-shutdown: User interface of shutdown. \
- deepin-lock: User interface of lock screen. \
- deepin-lockservice: The back-end service of locking screen. \
- lightdm-deepin-greeter: The user interface when you login in. \
- deepin-switchtogreeter: The tools to switch the user to login in. \
- deepin-lowpower: The user interface of reminding low power. \
- deepin-osd: User interface of on-screen display. \
- deepin-hotzone: User interface of setting hot zone."
LICENSE = "GPL-3.0+"

PV = "5.5.48"

RPM_NAME = "deepin-session-shell-5.5.48-1.4.aarch64.rpm"
RPM_HASH = "915f363069a03402e68aec75e36df3e52ee4a954685dd1155b7763b7cc34f84d12f3da6c6e12a86becaba14e17bac013f04d96f9bb34cad249e21c369d1ad478"

RPROVIDES:${PN} += "application() \
application(dde-lock.desktop) \
deepin-session-shell \
deepin-session-shell(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
deepin-wallpapers \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libX11.so.6()(64bit) \
libXi.so.6()(64bit) \
libXtst.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdframeworkdbus.so.2()(64bit) \
libdtkcore.so.5()(64bit) \
libdtkgui.so.5()(64bit) \
libdtkwidget.so.5()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgsettings-qt.so.1()(64bit) \
libpam.so.0()(64bit) \
libpam.so.0(LIBPAM_1.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libxcb.so.1()(64bit)"

inherit rpm
