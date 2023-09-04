SUMMARY = "Configuration for the GraphicsMagick image conversion library"
DESCRIPTION = "GraphicsMagick provides an image manipulation and translation utility \
and library. It can read and write over 88 image formats, including \
JPEG, TIFF, WMF, SVG, PNG, PNM, GIF, andPhoto CD. It also allows to \
resize, rotate, sharpen, color reduce, or add special effects to an \
image and to save the result to any supported format. GraphicsMagick \
may be used to create animated or transparent .gifs, to composite \
images, and to create thumbnail images. \
 \
This package contains GraphicsMagick library configuration files."
LICENSE = "MIT"

PV = "1.3.40"

RPM_NAME = "libGraphicsMagick3-config-1.3.40-3.1.aarch64.rpm"
RPM_HASH = "e1a3cfd150d73a4b6d4b3d82630b746b4e028289666aa2af2f4b3a61cd2a125dad17c89e79c26c082035fdfb65829a615eeba0f06d4c22ca01c5d580ee94fcc5"

RPROVIDES:${PN} += "libGraphicsMagick3-config"

RDEPENDS:${PN} += ""

inherit rpm
