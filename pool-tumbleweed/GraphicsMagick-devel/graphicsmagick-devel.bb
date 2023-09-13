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

RPM_NAME = "GraphicsMagick-devel-1.3.40-5.1.aarch64.rpm"
RPM_HASH = "b43df7c0cea5bd16606514fb7ad7b559ec953b9511663199831a4b890669345640d02374bccba2f11afe527cd14b040fa0f76698325388fb9025793399c74093"

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
