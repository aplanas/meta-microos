SUMMARY = "VLC-based Multimedia Player"
DESCRIPTION = "Kaffeine is a media player. \
What makes it different from the others is its excellent support of digital TV (DVB). \
Kaffeine has a user-friendly interface so that even first-time users can start immediately \
playing their movies: from DVD (including DVD menus, titles, chapters, etc.), VCD, or a file."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.18git.20230531T022124~afc6c12"

RPM_NAME = "kaffeine-2.0.18git.20230531T022124~afc6c12-1.1.aarch64.rpm"
RPM_HASH = "0576eac8a007a6cb51dc1ca97e49caafd4100f55415a1bfd49d04c5a29a3c9e531e8ce492ff63c81704b7be0f8808fca26b8ff0342f3c5c7988cb7c76c799bec"

RPROVIDES:${PN} += "kaffeine"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5Solid.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Sql.so.5 \
libQt5Sql5-sqlite \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libQt5Xml.so.5 \
libXss.so.1 \
libc.so.6 \
libdvbv5.so.0 \
libm.so.6 \
libstdc++.so.6 \
libvlc.so.5 \
vlc-noX"

inherit rpm
