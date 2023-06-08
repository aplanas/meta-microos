SUMMARY = "Viewer and Converter for Images"
DESCRIPTION = "GraphicsMagick provides an image manipulation and translation \
utility. It is capable of displaying still images and animations \
using the X Window system which provides an interface for \
interactively editing images, and is capable of importing selected \
windows or the entire desktop. It can read and write over 88 image \
formats, including JPEG, TIFF, WMF, SVG, PNG, PNM, GIF, andPhoto CD. \
It also allows to resize, rotate, sharpen, color reduce, or add \
special effects to an image and to save the result to any supported \
format. GraphicsMagick may be used to create animated or transparent \
.gifs, to composite images, and to create thumbnail images. \
 \
This package is compiled with Q16, which means that it provides better \
performance on 16 bit images and less."
LICENSE = "MIT"

PV = "1.3.40"

RPM_NAME = "GraphicsMagick-1.3.40-2.3.aarch64.rpm"
RPM_HASH = "6066204fe3bad0c35890f586cf3c3766a2d674f6f9695fda4915035e6bd70c49825003f2ff368bf5ba7107a27b32808051fe022c76e81d8663a46a933fcf24a9"

RPROVIDES:${PN} += "GraphicsMagick GraphicsMagick(aarch-64)"
RDEPENDS:${PN} += "libGraphicsMagick-Q16.so.3()(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
