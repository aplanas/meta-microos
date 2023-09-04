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

RPM_NAME = "libGraphicsMagick++-devel-1.3.40-3.1.aarch64.rpm"
RPM_HASH = "7cef05d6f81efdb8ff5fb8fa0a3d4486b4acaf53ffd9297b83a80c775e4a4da2af38f6a420b2ebd600b8b54a69a68198238dc9ef6cf4252ea80bf7cd7c15f4e2"

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
