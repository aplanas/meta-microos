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

RPM_NAME = "libGraphicsMagick3-config-1.3.40-4.1.aarch64.rpm"
RPM_HASH = "8d98e5c86338d118a5c01dd338274d79d4a439fa5e2234c34fe1f5ec5e2fc5d86812b4835981e5e4cba0c50765364bd34ee545d1447b61e6f1bd56bed4f17919"

RPROVIDES:${PN} += "libGraphicsMagick3-config"

RDEPENDS:${PN} += ""

inherit rpm
