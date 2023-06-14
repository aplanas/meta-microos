SUMMARY = "Muffin shared libraries"
DESCRIPTION = "Cinnamon Desktop default window manager. \
Muffin uses GTK+ and Clutter to do everything. \
 \
This package provides Muffin's shared libraries."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "5.2.1"

RPM_NAME = "libmuffin0-5.2.1-1.1.aarch64.rpm"
RPM_HASH = "f206187d6a05e18359ba049b81c865ce94182fa76335a3019b2c3e1d21911a52afc93198eed72e1bf40ce97ad5d7a37bbc3444de99014fdb05d5d445c2193ac9"

RPROVIDES:${PN} += "libmuffin.so.0 \
libmuffin0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libICE.so.6 \
libSM.so.6 \
libX11-xcb.so.1 \
libX11.so.6 \
libXcomposite.so.1 \
libXcursor.so.1 \
libXdamage.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXinerama.so.1 \
libXrandr.so.2 \
libXrender.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libgirepository-1.0.so.1 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libmuffin-clutter-0.so \
libmuffin-cogl-0.so \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libstartup-notification-1.so.0 \
libxcb-res.so.0"

inherit rpm
