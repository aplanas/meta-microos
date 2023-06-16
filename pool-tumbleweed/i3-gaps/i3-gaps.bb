SUMMARY = "Tiling window manager"
DESCRIPTION = "i3-gaps is a fork of i3, which adds features such as gaps between tiles."
LICENSE = "BSD-3-Clause"

PV = "4.21.1"

RPM_NAME = "i3-gaps-4.21.1-1.3.aarch64.rpm"
RPM_HASH = "f3698c573b395225fabcc0a7093556949291c178d63632c3dadc752b9830d1814bdee1fbe471b4bf45d9f4ebbf1da139043ae801ea364db1aa8256f3e221aee1"

RPROVIDES:${PN} += "config-i3-gaps \
i3 \
i3-gaps \
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
libyajl.so.2"

inherit rpm
