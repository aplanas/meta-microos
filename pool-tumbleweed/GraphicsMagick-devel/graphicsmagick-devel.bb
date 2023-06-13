SUMMARY = "Development files for the GraphicsMagick C language API"
DESCRIPTION = "GraphicsMagick provides an image manipulation and translation utility \
and library. It can read and write over 88 image formats, including \
JPEG, TIFF, WMF, SVG, PNG, PNM, GIF, andPhoto CD. It also allows to \
resize, rotate, sharpen, color reduce, or add special effects to an \
image and to save the result to any supported format. GraphicsMagick \
may be used to create animated or transparent .gifs, to composite \
images, and to create thumbnail images."
LICENSE = "MIT"

PV = "1.3.40"

RPM_NAME = "GraphicsMagick-devel-1.3.40-2.3.aarch64.rpm"
RPM_HASH = "3fb4c42861f17d737302476d4bf239224caa4a3ab2ea78de58cbbec6302e58a9c06e09231e02fcb5b4171a310e12bb12282b48d0bb618c95ae2479f78977c9c7"

RPROVIDES:${PN} += "GraphicsMagick-devel \
GraphicsMagick-devel(aarch-64) \
pkgconfig(GraphicsMagick) \
pkgconfig(GraphicsMagickWand)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
glibc-devel \
libGraphicsMagick-Q16-3 \
libGraphicsMagickWand-Q16-2 \
pkgconfig(GraphicsMagick)"

inherit rpm
