SUMMARY = "Development files for the GraphicsMagick C++ language API"
DESCRIPTION = "GraphicsMagick provides an image manipulation and translation utility \
and library. It can read and write over 88 image formats, including \
JPEG, TIFF, WMF, SVG, PNG, PNM, GIF, andPhoto CD. It also allows to \
resize, rotate, sharpen, color reduce, or add special effects to an \
image and to save the result to any supported format. GraphicsMagick \
may be used to create animated or transparent .gifs, to composite \
images, and to create thumbnail images."
LICENSE = "MIT"

PV = "1.3.40"

RPM_NAME = "libGraphicsMagick++-devel-1.3.40-4.1.aarch64.rpm"
RPM_HASH = "0a3ef80238fec50c4a4c3f7242980bf3b4222de771d07a2d7036eef51d9a2a4575510f6c825885790f71e2771fb9a8fdbffdc2c110d712b2db0c3ec391697700"

RPROVIDES:${PN} += "GraphicsMagick-C++-devel \
libGraphicsMagick++-devel \
pkgconfig-GraphicsMagick++"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
GraphicsMagick-devel \
c++-compiler \
libGraphicsMagick++-Q16-12 \
pkgconfig-GraphicsMagick"

inherit rpm
