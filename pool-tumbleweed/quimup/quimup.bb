SUMMARY = "A client for the music player daemon (MPD)"
DESCRIPTION = "QUIMUP is a client for the music player daemon (MPD) written in C++ and QT3. \
 \
The program can be used with most Linux desktops (KDE, GNOME, XFCE). \
The interface offers controlling MPD's many features. \
The focus is on mouse handling: playlist management is done entirely by drag-&-drop; \
playback functions are directly accessible from the system tray."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.4"

RPM_NAME = "quimup-1.4.4-1.25.aarch64.rpm"
RPM_HASH = "e8f9bc74e2f7ca9a8d901ee6841a8e7f9f0f46e3957016e76d58133f61fede34a8d4ca7b490e57723d546b7b6798d967196310a95fb5df0fb75516f8147194ba"

RPROVIDES:${PN} += "quimup"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libmpdclient.so.2 \
libstdc++.so.6 \
libtag.so.1 \
mpd"

inherit rpm
