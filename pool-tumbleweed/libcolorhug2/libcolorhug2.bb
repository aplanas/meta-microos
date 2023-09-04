SUMMARY = "Library for managing color devices"
DESCRIPTION = "colord is a system activated daemon that maps devices to color profiles. \
It is used by gnome-color-manager for system integration and use when \
there are no users logged in."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.6"

RPM_NAME = "libcolorhug2-1.4.6-4.1.aarch64.rpm"
RPM_HASH = "544158582271c39e2ece826c01282fdb8f726beb178322a4d7316b81db186ace18c597dd2995e04a2c46766834baa4268c269d66e7dff911280284f5f8513994"

RPROVIDES:${PN} += "libcolorhug.so.2 \
libcolorhug2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcolordprivate.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgusb.so.2"

inherit rpm
