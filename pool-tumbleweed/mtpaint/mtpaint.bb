SUMMARY = "Painting program for creating icons and pixel-based artwork"
DESCRIPTION = "mtPaint is a painting program designed for creating icons and \
pixel-based artwork. It can edit indexed palette or 24 bit RGB images \
and offers basic painting and palette manipulation tools. Its main \
file format is PNG, although it can also handle JPEG, GIF, TIFF, BMP, \
XPM, and XBM files."
LICENSE = "GPL-3.0-or-later"

PV = "3.50"

RPM_NAME = "mtpaint-3.50-1.11.aarch64.rpm"
RPM_HASH = "87885063f0e7d5cecb3dae02e353d137651e738e5b3826946f2ba03890f4b3aa7319fb52224ae55872cfbbbe0c5a9a20a762fe6f251202e3b91e1a26171f9a00"

RPROVIDES:${PN} += "mtpaint"

RDEPENDS:${PN} += "/usr/bin/sh \
ImageMagick \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libfreetype.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgif.so.7 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libjpeg.so.8 \
liblcms2.so.2 \
libm.so.6 \
libopenjp2.so.7 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpng16.so.16 \
libtiff.so.6 \
libwebp.so.7 \
libz.so.1"

inherit rpm
