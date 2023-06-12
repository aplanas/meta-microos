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

RPM_NAME = "libGraphicsMagick3-config-1.3.40-2.3.aarch64.rpm"
RPM_HASH = "d45cb5ecacf71e0fdae29bd938070d91103f993bdc8e0dc936fb0a95610287c9d9a8685dddeb0c4486537aff0b9b28751f646ca34fdaf8fc59fa9a598bf6a193"

RPROVIDES:${PN} += "libGraphicsMagick3-config \
libGraphicsMagick3-config(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
