SUMMARY = "GObject access to image scanners"
DESCRIPTION = "Libinsane is a library to access scanners on multiple platforms. \
It takes care of quirks of platforms and scanners. \
 \
This package provides GObject wrappers around the main library."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.9"

RPM_NAME = "libinsane_gobject1-1.0.9-1.9.aarch64.rpm"
RPM_HASH = "d5fefdc870214c8903a05928c60e8161fe5df73df0072a267dfe85992f6528f978507bd1b6fe8768496f5d991abde016addbbffb91a041aceba95b6624f2fb17"

RPROVIDES:${PN} += "libinsane-gobject.so.1 \
libinsane-gobject1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libinsane.so.1 \
libinsane1"

inherit rpm
