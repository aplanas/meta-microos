SUMMARY = "Image Viewer for the Linux Framebuffer Console"
DESCRIPTION = "This is a image viewer for Linux framebuffer devices. It has PhotoCD, \
jpeg, ppm, gif, tiff, xwd, bmp, and png support built-in.  Unknown \
formats are piped through convert (ImageMagick), which hopefully can \
handle it."
LICENSE = "GPL-2.0-or-later"

PV = "2.14"

RPM_NAME = "fbi-2.14-4.2.aarch64.rpm"
RPM_HASH = "ac1b37ba0f75a53d3a8c819aa3459a4555eb8d52142ea0633655fc5cc76e4696b53d6ff5c00a3f048ff357093cb3082ced04188f3ef0470d481e1a90e7c78922"

RPROVIDES:${PN} += "fbi"

RDEPENDS:${PN} += "/usr/bin/sh \
ghostscript-library \
libc.so.6 \
libdrm.so.2 \
libexif.so.12 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgif.so.7 \
libjpeg.so.8 \
libm.so.6 \
libpcd.so.2 \
libpixman-1.so.0 \
libpng16.so.16 \
libtiff.so.6"

inherit rpm
