SUMMARY = "A client for the music player daemon (MPD)"
DESCRIPTION = "QUIMUP is a client for the music player daemon (MPD) written in C++ and QT3. \
 \
The program can be used with most Linux desktops (KDE, GNOME, XFCE). \
The interface offers controlling MPD's many features. \
The focus is on mouse handling: playlist management is done entirely by drag-&-drop; \
playback functions are directly accessible from the system tray."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.4"

RPM_NAME = "quimup-1.4.4-1.24.aarch64.rpm"
RPM_HASH = "db58d31a0cffbcd7af788f0b0d10f968a35dd652e53d3413a98e92145b1fc5ef6cd5c2ea28eb776e3b6d4f85478cf620a1627863257e12e9ea59bb1eaa1fc91e"

RPROVIDES:${PN} += "application() \
application(quimup.desktop) \
quimup \
quimup(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libmpdclient.so.2()(64bit) \
libmpdclient.so.2(libmpdclient2)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libtag.so.1()(64bit) \
mpd"

inherit rpm
