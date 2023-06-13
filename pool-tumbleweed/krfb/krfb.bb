SUMMARY = "Screen sharing using the VNC/RFB protocol"
DESCRIPTION = "VNC-compatible server to share KDE desktops."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "krfb-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "2eb15a6cec91cfd79149eb96ee7831a55e78ee24fd59150ae3adf4e962aae3af220a497c29618fdab413b1d980f90353e87b77a5d00dafc0233bfdc26510af5c"

RPROVIDES:${PN} += "application() \
application(org.kde.krfb.desktop) \
application(org.kde.krfb.virtualmonitor.desktop) \
krfb \
krfb(aarch-64) \
libkrfbprivate.so.5.0()(64bit) \
metainfo() \
metainfo(org.kde.krfb.appdata.xml)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5DNSSD.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5Wallet.so.5()(64bit) \
libKF5WaylandClient.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libKPipeWire.so.5()(64bit) \
libKPipeWireDmaBuf.so.5()(64bit) \
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
libX11.so.6()(64bit) \
libXtst.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libvncserver.so.1()(64bit) \
libwayland-client.so.0()(64bit) \
libxcb-damage.so.0()(64bit) \
libxcb-image.so.0()(64bit) \
libxcb-shm.so.0()(64bit) \
libxcb.so.1()(64bit)"

inherit rpm
