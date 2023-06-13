SUMMARY = "Tiling window manager"
DESCRIPTION = "i3-gaps is a fork of i3, which adds features such as gaps between tiles."
LICENSE = "BSD-3-Clause"

PV = "4.21.1"

RPM_NAME = "i3-gaps-4.21.1-1.3.aarch64.rpm"
RPM_HASH = "f3698c573b395225fabcc0a7093556949291c178d63632c3dadc752b9830d1814bdee1fbe471b4bf45d9f4ebbf1da139043ae801ea364db1aa8256f3e221aee1"

RPROVIDES:${PN} += "application() \
application(i3.desktop) \
config(i3-gaps) \
i3 \
i3-gaps \
i3-gaps(aarch-64) \
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
libyajl.so.2()(64bit)"

inherit rpm
