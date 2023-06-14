SUMMARY = "Thumbnail Management for Xfce"
DESCRIPTION = "Tumbler is a D-Bus service for applications to request thumbnails for various \
URI schemes and MIME types. It is an implementation of the thumbnail management \
D-Bus specification described on http://live.gnome.org/ThumbnailerSpec and \
extensible through a plugin interface or via specialized thumbnailer services \
implemented in accordance to the thumbnail management D-Bus specification."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.18.1"

RPM_NAME = "tumbler-4.18.1-1.1.aarch64.rpm"
RPM_HASH = "c71198b1b09a147cd34f18725973712af2ed6e4a36dee8a128b87d19db534578873486caf80a50b29b3c1c21a94f09a584c4798d9ea2efea61ea68911b978c37"

RPROVIDES:${PN} += "config-tumbler \
tumbler"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libcurl.so.4 \
libfreetype.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgepub-0.7.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgsf-1.so.114 \
libgstreamer-1.0.so.0 \
libgsttag-1.0.so.0 \
libjpeg.so.8 \
libopenrawgnome.so.9 \
libpng16.so.16 \
libpoppler-glib.so.8 \
libtumbler-1-0 \
libtumbler-1.so.0 \
libxfce4util.so.7"

inherit rpm
