SUMMARY = "Deepin terminal"
DESCRIPTION = "Deepin Terminal is an advanced terminal emulator with workspace, multiple \
windows, remote management, quake mode and other features."
LICENSE = "GPL-3.0-only"

PV = "5.4.33"

RPM_NAME = "deepin-terminal-5.4.33-1.7.aarch64.rpm"
RPM_HASH = "74ef84e63c5bc3490e6799f69216e704b077bbd37b3084b1bd9a15d39e4ba88bbf7afab43e4025465236f401cd6e531e0b1d5a95481b5e2491938e7943a978a7"

RPROVIDES:${PN} += "application() \
application(deepin-terminal.desktop) \
deepin-terminal \
deepin-terminal(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libdframeworkdbus.so.2()(64bit) \
libdtkcore.so.5()(64bit) \
libdtkgui.so.5()(64bit) \
libdtkwidget.so.5()(64bit) \
libgcc_s.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libsecret-1.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libterminalwidget5.so.0()(64bit) \
libxcb.so.1()(64bit)"

inherit rpm
