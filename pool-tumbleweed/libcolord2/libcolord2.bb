SUMMARY = "Library for managing color devices"
DESCRIPTION = "colord is a system activated daemon that maps devices to color profiles. \
It is used by gnome-color-manager for system integration and use when \
there are no users logged in."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.6"

RPM_NAME = "libcolord2-1.4.6-4.1.aarch64.rpm"
RPM_HASH = "b8206bec4a237533979d07113b483a0638d6d4b943e57923a5ff2ab0fb339e3d4b10faeb5a12ae5c93cde978e1e2e37bf27adde3990866e1f89a77559bee88f2"

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
