SUMMARY = "GLib integration of PackageKit"
DESCRIPTION = "PackageKit is a system designed to make installing and updating \
software on your computer easier.  The primary design goal is to unify \
all the software graphical tools used in different distributions, and \
use some of the latest technology like PolicyKit to make the process \
suck less."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.5"

RPM_NAME = "libpackagekit-glib2-18-1.2.5-9.3.aarch64.rpm"
RPM_HASH = "2f33135d1b1be835866fdeec63b558dde0b7b70096034f8bc009a1e1f68b3e2aee21c33c03de7264cf50917e1e347ee003010bfa8a0cb455dd3a3515046e989b"

RPROVIDES:${PN} += "libpackagekit-glib12 \
libpackagekit-glib2-18 \
libpackagekit-glib2-18(aarch-64) \
libpackagekit-glib2.so.18()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit)"

inherit rpm
