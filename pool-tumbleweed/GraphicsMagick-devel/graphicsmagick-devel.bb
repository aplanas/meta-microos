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

RPM_NAME = "GraphicsMagick-devel-1.3.40-2.4.aarch64.rpm"
RPM_HASH = "e8b7fdedf0b248a14884857cec66da5b0d7dfd357c631e09ff07e350e95ce09336b889d26d0820dfe837611ab5f619c61f6c1f8a668dfcbc46044dda36f5ad17"

RPROVIDES:${PN} += "GraphicsMagick-devel \
pkgconfig-GraphicsMagick \
pkgconfig-GraphicsMagickWand"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
glibc-devel \
libGraphicsMagick-Q16-3 \
libGraphicsMagickWand-Q16-2 \
pkgconfig-GraphicsMagick"

inherit rpm
