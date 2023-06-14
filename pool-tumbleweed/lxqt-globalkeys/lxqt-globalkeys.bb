SUMMARY = "Global keyboard shortcuts registration"
DESCRIPTION = "Daemon and library for global keyboard shortcuts registration"
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "lxqt-globalkeys-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "773f55aa4554441c6f239ac88248c14cd5a190bc8185369575f063864c6c666eaa9cadf4720d4a2df9b82db64c0a4b2dfe433156a224cd2af1651829891d8e8a"

RPROVIDES:${PN} += "config-lxqt-globalkeys \
lxqt-globalkeys \
lxqt-globalkeys-qt5"

RDEPENDS:${PN} += "desktop-file-utils \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
liblxqt.so.1 \
libstdc++.so.6"

inherit rpm
