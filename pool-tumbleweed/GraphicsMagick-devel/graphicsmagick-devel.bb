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

RPM_NAME = "GraphicsMagick-devel-1.3.40-4.1.aarch64.rpm"
RPM_HASH = "6787463726d972e5f1c6d2a27dd55841221e4d57a5fdecef12e92d1bc50e1d1a81f655c11555f3b0e24d1d5f1e31c8045ff8270255836a97cec78e1ca0c419ec"

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
