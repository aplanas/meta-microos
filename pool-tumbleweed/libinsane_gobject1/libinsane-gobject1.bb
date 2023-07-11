SUMMARY = "GObject access to image scanners"
DESCRIPTION = "Libinsane is a library to access scanners on multiple platforms. \
It takes care of quirks of platforms and scanners. \
 \
This package provides GObject wrappers around the main library."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.10"

RPM_NAME = "libinsane_gobject1-1.0.10-1.1.aarch64.rpm"
RPM_HASH = "3734e4827095d4dd251f48f22cb7075282761db4c3b6e38e5dd1313afdef1b9008268a16b2fb68b63bbf4bda2c61021d61207e8b83da7993d70892afe3d9747b"

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
