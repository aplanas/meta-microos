SUMMARY = "Library for managing color devices"
DESCRIPTION = "colord is a system activated daemon that maps devices to color profiles. \
It is used by gnome-color-manager for system integration and use when \
there are no users logged in."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.6"

RPM_NAME = "libcolord2-1.4.6-2.3.aarch64.rpm"
RPM_HASH = "6038088f80b0d27f58e7fa45db204b7128394148d4dd22020ad2cdcc9b178c1c8977e72fc09dbe8d5c46eb815b26176c9b04062f0ebcaaadf088ac811ae23a6e"

RPROVIDES:${PN} += "libcolord.so.2()(64bit) \
libcolord2 \
libcolord2(aarch-64) \
libcolordprivate.so.2()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
liblcms2.so.2()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
libudev.so.1(LIBUDEV_196)(64bit)"

inherit rpm
