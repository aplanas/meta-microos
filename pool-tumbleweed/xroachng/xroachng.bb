SUMMARY = "Shows cockroaches running over the desktop"
DESCRIPTION = "The classic xroach game for X11: displays disgusting cockroaches on your root \
window. These creepy crawlies scamper around until they find a window to \
hide under. Whenever you move or iconify a window, the exposed beetles again \
scamper for cover. \
 \
Adapted for desktop environments like Gnome and KDE. Still works for FVWM, TWM \
and the like. \
 \
Original copyright 1991 by J. T. Anderson. Squish option contributed by \
Rick Petkiewizc. Virtual root code adapted from patch sent by Colin \
Rafferty who borrowed it from Tom LaStrange. Several other folks sent \
similar fixes. Some glitches removed by patch from Guus Sliepen. \
 \
Willem Vermin adapted Xroach for Gnome, KFE etc. and added a graphical \
user interface."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.3"

RPM_NAME = "xroachng-1.0.3-1.1.aarch64.rpm"
RPM_HASH = "3e56edebf26c74c942385f28b64a361de413f272a716223808434b921f8a4d9214b411b26f354391c64598c60cb3111ca690e8bb5b729e4d9f7383017dba75ed"

RPROVIDES:${PN} += "application() \
application(xroachng.desktop) \
xroachng \
xroachng(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit)"

inherit rpm
