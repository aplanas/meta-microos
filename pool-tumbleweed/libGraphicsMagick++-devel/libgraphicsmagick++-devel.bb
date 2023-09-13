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

RPM_NAME = "libGraphicsMagick++-devel-1.3.40-5.1.aarch64.rpm"
RPM_HASH = "88b84ee0452a4cd9c04187a464c1301df7c399f92c4dd192b42a588cc0b61e423ecab2d1e0e94adb893a8cdc7d5a3da3ccf7ba9a113d88fb5f7b49ee4fb9750b"

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
