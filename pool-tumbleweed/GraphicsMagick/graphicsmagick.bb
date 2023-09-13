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

RPM_NAME = "GraphicsMagick-1.3.40-5.1.aarch64.rpm"
RPM_HASH = "c93890f6db660958fa42344674324953c7ba709f99d39c0c9597908d4a1922cd6c95e607fe6a026b59622558261f8d2c225712b430aa5873167961bafed4effd"

RPROVIDES:${PN} += "GraphicsMagick"

RDEPENDS:${PN} += "libGraphicsMagick-Q16.so.3 \
libc.so.6"

inherit rpm
