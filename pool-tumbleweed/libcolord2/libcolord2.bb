SUMMARY = "Library for managing color devices"
DESCRIPTION = "colord is a system activated daemon that maps devices to color profiles. \
It is used by gnome-color-manager for system integration and use when \
there are no users logged in."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.6"

RPM_NAME = "libcolord2-1.4.6-2.4.aarch64.rpm"
RPM_HASH = "158a6283dcfec15441b78834fe5b29aadf15a8b02992a246073678b7a8abfd307640bfe9f9e25d5ce3f7c04caf3110ba9d76ec9c7672bd427ad2553ec18e953d"

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
