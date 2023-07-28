SUMMARY = "Library for managing color devices"
DESCRIPTION = "colord is a system activated daemon that maps devices to color profiles. \
It is used by gnome-color-manager for system integration and use when \
there are no users logged in."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.6"

RPM_NAME = "libcolorhug2-1.4.6-3.1.aarch64.rpm"
RPM_HASH = "42a3c6241d53d625adffc82b50ab3f6e7ef658f30159d9149939496ac17f4997406d7ce54915830bc3018794b7dd464081850a0a762a84de617884e349153fd1"

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
