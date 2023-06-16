SUMMARY = "WebP GDK Pixbuf Loader library"
DESCRIPTION = "webp-pixbuf-loader is a plugin to allow loading WebP images in GTK+ applications."
LICENSE = "LGPL-2.0-or-later"

PV = "0.0.6"

RPM_NAME = "webp-pixbuf-loader-0.0.6-1.3.aarch64.rpm"
RPM_HASH = "87fc83408ce0aec3671f99aec8649653db3792058cfd2d81fb7685688c024d2a4276b36d258a5b6cb373ce58115164e84972056c63e66d058750150be9206f16"

RPROVIDES:${PN} += "libpixbufloader-webp.so \
webp-pixbuf-loader"

RDEPENDS:${PN} += "/usr/bin/sh \
gdk-pixbuf-query-loaders \
gdk-pixbuf-thumbnailer \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libwebp.so.7 \
libwebpdemux.so.2"

inherit rpm
