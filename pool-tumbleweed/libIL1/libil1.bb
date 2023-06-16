SUMMARY = "A cross-platform image library"
DESCRIPTION = "Developer's Image Library (DevIL) is a programmer's library to \
develop applications with image loading capabilities. Control of \
images is left to the developer, so unnecessary conversions, etc. are \
not performed. DevIL can load, save, convert, manipulate, filter and \
display a wide variety of image formats. \
 \
Currently, DevIL can load .bmp, .cut, .dds, .doom, .gif, .ico, .jpg, \
.lbm, .mdl, .mng, .pal, .pbm, .pcd, .pcx, .pgm, .pic, .png, .ppm, \
.psd, .psp, .raw, .sgi, .tga and .tif .hdr files. \
Formats supported for saving include .bmp, .dds, .h, .jpg, .pal, \
.pbm, .pcx, .hdr, .pgm,.png, .ppm, .raw, .sgi, .tga and .tif. \
 \
DevIL currently supports the following APIs for display: OpenGL, \
SDL and Allegro."
LICENSE = "LGPL-2.1-only"

PV = "1.7.8"

RPM_NAME = "libIL1-1.7.8-11.11.aarch64.rpm"
RPM_HASH = "4fe69daef8af54c38dd3e0adc41b828ec37611e1ea17e15f02d65fdc98cc2c8ab49b43c704d9052242ae3d2201861c293948d2cb878d615314b3b56261e6d645"

RPROVIDES:${PN} += "libIL.so.1 \
libIL1 \
libILU.so.1 \
libILUT.so.1 \
libdevil1"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libImath-3-1.so.29 \
libOpenEXR-3-1.so.30 \
libSDL-1.2.so.0 \
libX11.so.6 \
libXext.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libjpeg.so.8 \
libm.so.6 \
libmng.so.2 \
libpng16.so.16 \
libstdc++.so.6 \
libtiff.so.6"

inherit rpm
