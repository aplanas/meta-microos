SUMMARY = "MPD Client Plugin for the Xfce Panel"
DESCRIPTION = "The Mpc plugin is a simple Music Player Daemon client which can control \
playback and show the currently playing song."
LICENSE = "ISC"

PV = "0.5.3"

RPM_NAME = "xfce4-mpc-plugin-0.5.3-1.1.aarch64.rpm"
RPM_HASH = "3cf252242c2a6023cfaeac8b26ada9633f7800f5bc048edf6b2b0c371b6f8e443ee9d1b1cee5fee9846951d474c38c826a11ad9e9e748c67b9a03cdd475fa379"

RPROVIDES:${PN} += "libmpc.so \
xfce4-mpc-plugin \
xfce4-panel-plugin-mpc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libmpd.so.1 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
xfce4-panel"

inherit rpm
