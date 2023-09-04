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

RPM_NAME = "GraphicsMagick-1.3.40-3.1.aarch64.rpm"
RPM_HASH = "5ecb0ee9726e27c9741c65993e024e84c7f4c2559db30dbf6c4fbfa40fb9fd494f466f7c58c71f720a1d80be75382f65fd609ed0c7c1372fa89c1d347a94c497"

RPROVIDES:${PN} += "GraphicsMagick"

RDEPENDS:${PN} += "libGraphicsMagick-Q16.so.3 \
libc.so.6"

inherit rpm
