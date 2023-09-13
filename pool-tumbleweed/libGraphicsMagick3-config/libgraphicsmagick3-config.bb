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

RPM_NAME = "libGraphicsMagick3-config-1.3.40-5.1.aarch64.rpm"
RPM_HASH = "92f8f66cd54ca062931c57d068b0b440460800f67dccf844d1b08a07712547a6b6510b48b25a4ffa8f62290ee586b7a110939fd4918ab2a86db735df4b0265c1"

RPROVIDES:${PN} += "libGraphicsMagick3-config"

RDEPENDS:${PN} += ""

inherit rpm
