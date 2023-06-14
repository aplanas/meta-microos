SUMMARY = "Image viewer for the Xfce Desktop Environment"
DESCRIPTION = "The Ristretto Image Viewer is an application that can be used to \
view, and scroll through images. \
 \
It can be used to run a slideshow of images, open images with other \
applications like an image editor or configure an image as the \
desktop wallpaper."
LICENSE = "GPL-2.0-or-later"

PV = "0.13.1"

RPM_NAME = "ristretto-0.13.1-1.1.aarch64.rpm"
RPM_HASH = "d3036c1bd0e8b6f5a1cacab0e303038f93e6b123542cebad07e6d7f9ace71aab252ccb858508ecb11fcc690a546f5ec830ee9cbee07f4813a6793c4ce8c00364"

RPROVIDES:${PN} += "ristretto"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libexif.so.12 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libmagic.so.1 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
libxfconf-0.so.3"

inherit rpm
