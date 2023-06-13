SUMMARY = "MPD Client Plugin for the Xfce Panel"
DESCRIPTION = "The Mpc plugin is a simple Music Player Daemon client which can control \
playback and show the currently playing song."
LICENSE = "ISC"

PV = "0.5.3"

RPM_NAME = "xfce4-mpc-plugin-0.5.3-1.1.aarch64.rpm"
RPM_HASH = "3cf252242c2a6023cfaeac8b26ada9633f7800f5bc048edf6b2b0c371b6f8e443ee9d1b1cee5fee9846951d474c38c826a11ad9e9e748c67b9a03cdd475fa379"

RPROVIDES:${PN} += "libmpc.so()(64bit) \
xfce4-mpc-plugin \
xfce4-mpc-plugin(aarch-64) \
xfce4-panel-plugin-mpc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libmpd.so.1()(64bit) \
libxfce4panel-2.0.so.4()(64bit) \
libxfce4ui-2.so.0()(64bit) \
libxfce4util.so.7()(64bit) \
xfce4-panel"

inherit rpm
