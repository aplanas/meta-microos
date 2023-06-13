SUMMARY = "VFS functionality for GLib -- iPod / iPhone Support"
DESCRIPTION = "This package provides a gvfs backend that supports iPod / iPhone devices."
LICENSE = "LGPL-2.0-or-later"

PV = "1.50.4"

RPM_NAME = "gvfs-backend-afc-1.50.4-2.1.aarch64.rpm"
RPM_HASH = "a033263695a1c1a292f12cb2ebbba2b3cb2e71619b5287d0cc1105b0461d2d121edb1efd7f232e1b4efea603e9b10157e9af91e05afc6e6b7c4d09ccb89a7ecf"

RPROVIDES:${PN} += "gvfs-backend-afc \
gvfs-backend-afc(aarch-64)"

RDEPENDS:${PN} += "gvfs \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgvfscommon.so()(64bit) \
libgvfsdaemon.so()(64bit) \
libimobiledevice-1.0.so.6()(64bit) \
libplist-2.0.so.3()(64bit)"

inherit rpm
