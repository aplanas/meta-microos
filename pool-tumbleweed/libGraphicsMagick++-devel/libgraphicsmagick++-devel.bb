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

RPM_NAME = "libGraphicsMagick++-devel-1.3.40-2.4.aarch64.rpm"
RPM_HASH = "4a8d9d2972a15ca60fa2295c311779d2b738b218d477c34f98e475313b583181ab0614bb75bb6abd310301704f3e6a419d79a3bc1268c79de6d4238cbf860ebb"

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
