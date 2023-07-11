SUMMARY = "Library for managing color devices"
DESCRIPTION = "colord is a system activated daemon that maps devices to color profiles. \
It is used by gnome-color-manager for system integration and use when \
there are no users logged in."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.6"

RPM_NAME = "libcolorhug2-1.4.6-2.4.aarch64.rpm"
RPM_HASH = "d5f3647e83be32b9a65f1129d7104f8fb40425af1ddd47a84b9a89548c8988a42c95ca5fd8aa575077bdd8bdea014945db7fa5072db1e8220ab93b3a37f629bf"

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
