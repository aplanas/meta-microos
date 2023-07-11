SUMMARY = "Adwaita Qt6 library"
DESCRIPTION = " \
 \
 \
 \
Adwaita theme variant for applications utilizing Qt6"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.4.2"

RPM_NAME = "libadwaitaqt6-1-1.4.2-3.4.aarch64.rpm"
RPM_HASH = "4448784bc2280b223e34442051b943b6165a14bad0f64bb00237234562fbce9d41cb90a667571ab1421cd43504520df4b80a47f6908195e45c93a04b2f0a42ee"

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
