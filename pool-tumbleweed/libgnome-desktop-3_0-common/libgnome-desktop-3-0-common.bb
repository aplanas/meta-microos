SUMMARY = "Common data files for the GNOME Desktop API library"
DESCRIPTION = "The libgnome-desktop library provides API shared by several applications \
on the desktop, but that cannot live in the platform for various \
reasons. \
 \
This package contains data files used by libgnome-dekstop."
LICENSE = "LGPL-2.1-or-later"

PV = "44.0"

RPM_NAME = "libgnome-desktop-3_0-common-44.0-1.1.aarch64.rpm"
RPM_HASH = "ea506a8ea5cd4f4e7fc1f634a382d2a9039cd3c0b29299eaa8b4dff579fb6b2a7b9871a390a94647e170d804ffbae764a1a71a8a7d6adf3b24c837b7a99e7f4f"

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
