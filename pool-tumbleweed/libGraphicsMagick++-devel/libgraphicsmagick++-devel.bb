SUMMARY = "Development files for the GraphicsMagick C++ language API"
DESCRIPTION = "GraphicsMagick provides an image manipulation and translation utility \
and library. It can read and write over 88 image formats, including \
JPEG, TIFF, WMF, SVG, PNG, PNM, GIF, andPhoto CD. It also allows to \
resize, rotate, sharpen, color reduce, or add special effects to an \
image and to save the result to any supported format. GraphicsMagick \
may be used to create animated or transparent .gifs, to composite \
images, and to create thumbnail images."
LICENSE = "MIT"

PV = "1.3.40"

RPM_NAME = "libGraphicsMagick++-devel-1.3.40-2.3.aarch64.rpm"
RPM_HASH = "ad0028f5f95c7fd3aa7ed7a2282f33f243aa893cc99a005ebed456efcd7b351dd1f6c3353b738971a76cb70a2608134ef8e00e1053394be569b9de1693e639a3"

RPROVIDES:${PN} += "GraphicsMagick-C++-devel \
libGraphicsMagick++-devel \
libGraphicsMagick++-devel(aarch-64) \
pkgconfig(GraphicsMagick++)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
GraphicsMagick-devel \
c++_compiler \
libGraphicsMagick++-Q16-12 \
pkgconfig(GraphicsMagick)"

inherit rpm
