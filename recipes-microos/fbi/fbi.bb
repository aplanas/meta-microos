SUMMARY = "Image Viewer for the Linux Framebuffer Console"
DESCRIPTION = "This is a image viewer for Linux framebuffer devices. It has PhotoCD, \
jpeg, ppm, gif, tiff, xwd, bmp, and png support built-in.  Unknown \
formats are piped through convert (ImageMagick), which hopefully can \
handle it."
LICENSE = "GPL-2.0-or-later"

PV = "2.14"

RPM_NAME = "fbi-2.14-4.1.aarch64.rpm"
RPM_HASH = "41097c20c1d6b4c13ff174027704ea679637d2952a621c4814f3cd4c3059b517df00f83ab1b1b35530c0cf37d5ecb39f369173312047f1f8fa316ab0f6a25f2d"

RPROVIDES:${PN} += "fbi fbi(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ghostscript-library libc.so.6(GLIBC_2.34)(64bit) libdrm.so.2()(64bit) libexif.so.12()(64bit) libfontconfig.so.1()(64bit) libfreetype.so.6()(64bit) libgif.so.7()(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libpcd.so.2()(64bit) libpixman-1.so.0()(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libtiff.so.6()(64bit) libtiff.so.6(LIBTIFF_4.0)(64bit)"

inherit rpm
