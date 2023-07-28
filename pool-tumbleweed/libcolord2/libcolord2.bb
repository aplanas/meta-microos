SUMMARY = "Library for managing color devices"
DESCRIPTION = "colord is a system activated daemon that maps devices to color profiles. \
It is used by gnome-color-manager for system integration and use when \
there are no users logged in."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.6"

RPM_NAME = "libcolord2-1.4.6-3.1.aarch64.rpm"
RPM_HASH = "30bb80ec61a817894698b62047c34b5c909ae242860813c065aa84c34a50a871a08e9321224fb97dfbb79ddc1a4642a9a323d72a7f56273a4d0a33499ea9c849"

RPROVIDES:${PN} += "libcolord.so.2 \
libcolord2 \
libcolordprivate.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
liblcms2.so.2 \
libm.so.6 \
libudev.so.1"

inherit rpm
