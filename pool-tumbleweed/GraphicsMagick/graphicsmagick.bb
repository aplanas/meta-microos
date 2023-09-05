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

RPM_NAME = "GraphicsMagick-1.3.40-4.1.aarch64.rpm"
RPM_HASH = "7730c0c9d3290acebb87452ca8a8ede2aaf1dadc9fd7902c71045b47af6ef3608e41c6bb7df796026fed2e44ec2720c0ee2f1a3763d86ee63a71195f7f70dd65"

RPROVIDES:${PN} += "GraphicsMagick"

RDEPENDS:${PN} += "libGraphicsMagick-Q16.so.3 \
libc.so.6"

inherit rpm
