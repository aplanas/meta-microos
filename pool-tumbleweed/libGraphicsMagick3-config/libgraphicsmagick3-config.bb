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

RPM_NAME = "libGraphicsMagick3-config-1.3.40-2.4.aarch64.rpm"
RPM_HASH = "e1349ba2ae39c9bc533be6c12460323952a8e83beb0b5fc95af0dc328579b84707feeba01ae6c54a86384cef192c9d5b483f10debe1884dab9bac1cccaa8531a"

RPROVIDES:${PN} += "libGraphicsMagick3-config"

RDEPENDS:${PN} += ""

inherit rpm
