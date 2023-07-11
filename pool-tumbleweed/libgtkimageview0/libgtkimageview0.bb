SUMMARY = "Library providing an advanced widget for GdkPixbuf"
DESCRIPTION = "GtkImageView is a widget that provides a zoomable and panable view of a \
GdkPixbuf. It is intended to be usable in most types of image viewing \
applications."
LICENSE = "LGPL-2.0-or-later"

PV = "1.6.4"

RPM_NAME = "libgtkimageview0-1.6.4-22.22.aarch64.rpm"
RPM_HASH = "aeef2791bff2e05113c3930d22defe092a478f07cd0dfa2510a27220beff013e072e0644e60894862f74d9437064d70d0dc36914ef0a4de4295f085f99ca2bb5"

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
