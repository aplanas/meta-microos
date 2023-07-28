SUMMARY = "GObject library, to access udev device information"
DESCRIPTION = "This package contains the GObject library libgudev, which provides \
access to udev device information."
LICENSE = "LGPL-2.1-or-later"

PV = "238"

RPM_NAME = "libgudev-1_0-0-238-1.1.aarch64.rpm"
RPM_HASH = "99a917663435574821b02e6ceb174cc9139f5bb0b13ec92af5c04d2c4686f8043f388e0f9bd2a98fde7cc92255b6214dcb106be1f83a314237b2726ebfb031d2"

RPROVIDES:${PN} += "libgudev-1-0-0 \
libgudev-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libudev.so.1"

inherit rpm
