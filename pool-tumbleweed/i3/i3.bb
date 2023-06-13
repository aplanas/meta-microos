SUMMARY = "Tiling window manager"
DESCRIPTION = "i3 is a tiling window manager for X11. It supports tiling, stacking, \
and tabbing layouts, which it handles dynamically. Configuration is \
achieved via plain text file and extending i3 is possible using its \
Unix domain socket and JSON based IPC interface."
LICENSE = "BSD-3-Clause"

PV = "4.22"

RPM_NAME = "i3-4.22-1.3.aarch64.rpm"
RPM_HASH = "cd0dd7d1e4dd2fa2e5363474aa237bc426c8a32742dcff00dbff847a33ab8bea57b6b0faa9cb61997ab9e318c08d1e619a0fdd0df5c1ce080e1e440aca7c16a6"

RPROVIDES:${PN} += "application() \
application(i3.desktop) \
config(i3) \
i3 \
i3(aarch-64) \
windowmanager"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libev.so.4()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libpcre2-8.so.0()(64bit) \
libstartup-notification-1.so.0()(64bit) \
libxcb-cursor.so.0()(64bit) \
libxcb-icccm.so.4()(64bit) \
libxcb-keysyms.so.1()(64bit) \
libxcb-randr.so.0()(64bit) \
libxcb-shape.so.0()(64bit) \
libxcb-util.so.1()(64bit) \
libxcb-xinerama.so.0()(64bit) \
libxcb-xkb.so.1()(64bit) \
libxcb-xrm.so.0()(64bit) \
libxcb.so.1()(64bit) \
libxkbcommon-x11.so.0()(64bit) \
libxkbcommon.so.0()(64bit) \
libyajl.so.2()(64bit) \
perl-AnyEvent-I3"

inherit rpm
