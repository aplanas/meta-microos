SUMMARY = "Common data files for the GNOME Desktop API library"
DESCRIPTION = "The libgnome-desktop library provides API shared by several applications \
on the desktop, but that cannot live in the platform for various \
reasons. \
 \
This package contains data files used by libgnome-dekstop."
LICENSE = "LGPL-2.1-or-later"

PV = "44.0"

RPM_NAME = "libgnome-desktop-3_0-common-44.0-1.2.aarch64.rpm"
RPM_HASH = "06cce19346cb0cf7513013ec82214f030a4a62bd1dae5a6b6fe373c46add8230c9791e307ce34a4759da892ce97ec9059e6c52aef4aaf622e80be3756a8d7682"

RPROVIDES:${PN} += "libgnome-desktop-3-0-common"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-desktop-3.so.20 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
