SUMMARY = "Tiling window manager"
DESCRIPTION = "i3 is a tiling window manager for X11. It supports tiling, stacking, \
and tabbing layouts, which it handles dynamically. Configuration is \
achieved via plain text file and extending i3 is possible using its \
Unix domain socket and JSON based IPC interface."
LICENSE = "BSD-3-Clause"

PV = "4.22"

RPM_NAME = "i3-4.22-1.3.aarch64.rpm"
RPM_HASH = "cd0dd7d1e4dd2fa2e5363474aa237bc426c8a32742dcff00dbff847a33ab8bea57b6b0faa9cb61997ab9e318c08d1e619a0fdd0df5c1ce080e1e440aca7c16a6"

RPROVIDES:${PN} += "config-i3 \
i3 \
windowmanager"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libev.so.4 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpcre2-8.so.0 \
libstartup-notification-1.so.0 \
libxcb-cursor.so.0 \
libxcb-icccm.so.4 \
libxcb-keysyms.so.1 \
libxcb-randr.so.0 \
libxcb-shape.so.0 \
libxcb-util.so.1 \
libxcb-xinerama.so.0 \
libxcb-xkb.so.1 \
libxcb-xrm.so.0 \
libxcb.so.1 \
libxkbcommon-x11.so.0 \
libxkbcommon.so.0 \
libyajl.so.2 \
perl-AnyEvent-I3"

inherit rpm
