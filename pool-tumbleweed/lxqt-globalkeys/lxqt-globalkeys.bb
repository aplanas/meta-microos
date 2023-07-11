SUMMARY = "Global keyboard shortcuts registration"
DESCRIPTION = "Daemon and library for global keyboard shortcuts registration"
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "lxqt-globalkeys-1.3.0-1.2.aarch64.rpm"
RPM_HASH = "bb0d851f74e6acfbb3738f52bca95ff9a16a3e1074acc742634411db0676c363f8beb688a4c67c6e4ed5483509eba91a7ea4d7c17893f7ddab6dfdd34de5b4dd"

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
