SUMMARY = "Painting program for creating icons and pixel-based artwork"
DESCRIPTION = "mtPaint is a painting program designed for creating icons and \
pixel-based artwork. It can edit indexed palette or 24 bit RGB images \
and offers basic painting and palette manipulation tools. Its main \
file format is PNG, although it can also handle JPEG, GIF, TIFF, BMP, \
XPM, and XBM files."
LICENSE = "GPL-3.0-or-later"

PV = "3.50"

RPM_NAME = "mtpaint-3.50-1.10.aarch64.rpm"
RPM_HASH = "4d506be00915dacc0695a1434ed73e116541d60871b58c5dc96abc93f639c08782c33380b9f71713a5513360100cd956bd39b3a00884c6649f2ffb5fc1b6afae"

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
