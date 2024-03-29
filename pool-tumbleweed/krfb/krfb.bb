SUMMARY = "Screen sharing using the VNC/RFB protocol"
DESCRIPTION = "VNC-compatible server to share KDE desktops."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "krfb-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "bf45d44a7addfbb4f78ba001238a6ce68172d0753cb011ba9f2056a51966ff761bdb1ee7faf48d668b99a4762ba93b2338e3ddcddb2cc43614ecd101507f669c"

RPROVIDES:${PN} += "krfb \
libkrfbprivate.so.5.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5DNSSD.so.5 \
libKF5I18n.so.5 \
libKF5Notifications.so.5 \
libKF5Wallet.so.5 \
libKF5WaylandClient.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libKPipeWire.so.5 \
libKPipeWireDmaBuf.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libXtst.so.6 \
libc.so.6 \
libstdc++.so.6 \
libvncserver.so.1 \
libwayland-client.so.0 \
libxcb-damage.so.0 \
libxcb-image.so.0 \
libxcb-shm.so.0 \
libxcb.so.1"

inherit rpm
