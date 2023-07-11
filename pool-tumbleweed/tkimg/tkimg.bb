SUMMARY = "More Image Formats for Tk"
DESCRIPTION = "This package contains a collection of image format handlers for the Tk \
photo image type, and a new image type, pixmaps. \
 \
The provided format handlers include bmp, gif, ico, jpeg, pcx, png, \
ppm, ps, sgi, sun, tga, tiff, xbm, and xpm."
LICENSE = "BSD-3-Clause"

PV = "1.4.14"

RPM_NAME = "tkimg-1.4.14-1.1.aarch64.rpm"
RPM_HASH = "cbc29f0320f4144ad57ee770bc824fc86e37bcf6d3455df1b52c0de1add8a06a48081d502c748a941a06d0bcfc0d7a1202bba1f296c9c4f03a028e38400d6e12"

RPROVIDES:${PN} += "libjpegtcl9.5.0.so \
libpngtcl1.6.38.so \
libtifftcl4.4.0.so \
libtkimg1.4.14.so \
libtkimgbmp1.4.14.so \
libtkimgdted1.4.14.so \
libtkimgflir1.4.14.so \
libtkimggif1.4.14.so \
libtkimgico1.4.14.so \
libtkimgjpeg1.4.14.so \
libtkimgpcx1.4.14.so \
libtkimgpixmap1.4.14.so \
libtkimgpng1.4.14.so \
libtkimgppm1.4.14.so \
libtkimgps1.4.14.so \
libtkimgraw1.4.14.so \
libtkimgsgi1.4.14.so \
libtkimgsun1.4.14.so \
libtkimgtga1.4.14.so \
libtkimgtiff1.4.14.so \
libtkimgwindow1.4.14.so \
libtkimgxbm1.4.14.so \
libtkimgxpm1.4.14.so \
libzlibtcl1.2.13.so \
tkimg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libm.so.6"

inherit rpm
