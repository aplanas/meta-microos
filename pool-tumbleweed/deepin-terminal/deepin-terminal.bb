SUMMARY = "Deepin terminal"
DESCRIPTION = "Deepin Terminal is an advanced terminal emulator with workspace, multiple \
windows, remote management, quake mode and other features."
LICENSE = "GPL-3.0-only"

PV = "5.4.33"

RPM_NAME = "deepin-terminal-5.4.33-1.8.aarch64.rpm"
RPM_HASH = "a221551cdd79f160d437a25975dc884f11d19c23762ae379163eb9f58d7dcba780134c80e001af13fbb855cfd49ec869e910f7d200883adb7a0ee82172948c04"

RPROVIDES:${PN} += "deepin-terminal"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libdframeworkdbus.so.2 \
libdtkcore.so.5 \
libdtkgui.so.5 \
libdtkwidget.so.5 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libsecret-1.so.0 \
libstdc++.so.6 \
libterminalwidget5.so.0 \
libxcb.so.1"

inherit rpm
