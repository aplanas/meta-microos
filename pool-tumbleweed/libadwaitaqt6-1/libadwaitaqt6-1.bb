SUMMARY = "Adwaita Qt6 library"
DESCRIPTION = " \
 \
 \
 \
Adwaita theme variant for applications utilizing Qt6"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.4.2"

RPM_NAME = "libadwaitaqt6-1-1.4.2-3.3.aarch64.rpm"
RPM_HASH = "b05c3fdb39fdf061b8be14ea1025cb11a9374690b59802f7b3b33da04e43eafd40ce5a8bcebcf6d3b4513165c0abcb82e3fee03a7e5667203b94d57895818d1b"

RPROVIDES:${PN} += "libadwaitaqt6-1 \
libadwaitaqt6.so.1 \
libadwaitaqt6priv.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
