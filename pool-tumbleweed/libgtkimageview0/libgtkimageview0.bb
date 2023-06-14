SUMMARY = "Library providing an advanced widget for GdkPixbuf"
DESCRIPTION = "GtkImageView is a widget that provides a zoomable and panable view of a \
GdkPixbuf. It is intended to be usable in most types of image viewing \
applications."
LICENSE = "LGPL-2.0-or-later"

PV = "1.6.4"

RPM_NAME = "libgtkimageview0-1.6.4-22.21.aarch64.rpm"
RPM_HASH = "3284db04a6d3e6542992c108a9476cfa8c025ecf00ddcb828bc0282c75603b64c34cb8d5488984f0efa30ec4d8947bef25aebdbfef1b318bf5b97da2c5a469d4"

RPROVIDES:${PN} += "libgtkimageview.so.0 \
libgtkimageview0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
