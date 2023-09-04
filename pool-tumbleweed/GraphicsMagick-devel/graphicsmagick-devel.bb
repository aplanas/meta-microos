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

RPM_NAME = "GraphicsMagick-devel-1.3.40-3.1.aarch64.rpm"
RPM_HASH = "4e2ef0b1b55f492838c732ef57660372d8e149e7e9a2cc0d0738c86b24cde3263097376cb4f30d6ffc747ea019d7df744a9c2d87f5626ca0f5a36e1dec7d1b38"

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
