SUMMARY = "GLib integration of PackageKit"
DESCRIPTION = "PackageKit is a system designed to make installing and updating \
software on your computer easier.  The primary design goal is to unify \
all the software graphical tools used in different distributions, and \
use some of the latest technology like PolicyKit to make the process \
suck less."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.5"

RPM_NAME = "libpackagekit-glib2-18-1.2.5-9.4.aarch64.rpm"
RPM_HASH = "e7577631c6d95963b35e8894875ac36dcbb845f18989ed82b4ebc4331f61bca9d755d4f8f66adbc21b01782737c3d9e6ab121ff850addf9edecda5cdc3719ac7"

RPROVIDES:${PN} += "libpackagekit-glib12 \
libpackagekit-glib2-18 \
libpackagekit-glib2.so.18"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
