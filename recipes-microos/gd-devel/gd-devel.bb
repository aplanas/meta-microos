SUMMARY = "Drawing Library for Programs with PNG and JPEG Output"
DESCRIPTION = "gd allows code to quickly draw images complete with lines, arcs, text, \
multiple colors, cut and paste from other images, and flood fills. gd \
writes out the result as a PNG or JPEG file. This is particularly \
useful in World Wide Web applications, where PNG and JPEG are two of \
the formats accepted for inline images by most browsers."
LICENSE = "MIT"

PV = "2.3.3"

RPM_NAME = "gd-devel-2.3.3-3.3.aarch64.rpm"
RPM_HASH = "aab8c5adb907d007e67195c2de29314065611be81cb7d569da6a144695195b776100c310bc7cbc9392edc2c850c8275b84cf619d472eaba2b38f830ef987db9b"

RPROVIDES:${PN} += "gd-devel gd-devel(aarch-64) pkgconfig(gdlib)"
RDEPENDS:${PN} += "/usr/bin/pkg-config glibc-devel libgd3 pkgconfig(fontconfig) pkgconfig(freetype2) pkgconfig(libavif) pkgconfig(libjpeg) pkgconfig(libpng) pkgconfig(libtiff-4) pkgconfig(libwebp) pkgconfig(xpm) pkgconfig(zlib)"

inherit rpm
