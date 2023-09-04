SUMMARY = "Perl interface for the GraphicsMagick image conversion library"
DESCRIPTION = "GraphicsMagick provides an image manipulation and translation utility \
and library. It can read and write over 88 image formats, including \
JPEG, TIFF, WMF, SVG, PNG, PNM, GIF, andPhoto CD. It also allows to \
resize, rotate, sharpen, color reduce, or add special effects to an \
image and to save the result to any supported format. GraphicsMagick \
may be used to create animated or transparent .gifs, to composite \
images, and to create thumbnail images. \
 \
This package contains perl interface to GraphicsMagick library."
LICENSE = "MIT"

PV = "1.3.40"

RPM_NAME = "perl-GraphicsMagick-1.3.40-3.1.aarch64.rpm"
RPM_HASH = "90898ff5ddfe32eb8dea608e9a064f95f951a52b7fa541a9015f30b48090495b04b417f9a514896c75a303b8f130ddef5d729009b99a0df9d316da49cf27282c"

RPROVIDES:${PN} += "perl-Graphics--Magick \
perl-GraphicsMagick"

RDEPENDS:${PN} += "GraphicsMagick \
ld-linux-aarch64.so.1 \
libGraphicsMagick-Q16.so.3 \
libc.so.6 \
libm.so.6 \
perl"

inherit rpm
