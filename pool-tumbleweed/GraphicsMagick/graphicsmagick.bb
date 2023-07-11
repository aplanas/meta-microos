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

RPM_NAME = "GraphicsMagick-1.3.40-2.4.aarch64.rpm"
RPM_HASH = "89aae2a4ceb4b38979ef9f37245ec9e24c1c17bdbda82519f6344914f338f938d07a9f02f7a076660fbf9989f99e214bca1b0013af0f8f1f3b936dd18f6f5589"

RPROVIDES:${PN} += "GraphicsMagick"

RDEPENDS:${PN} += "libGraphicsMagick-Q16.so.3 \
libc.so.6"

inherit rpm
