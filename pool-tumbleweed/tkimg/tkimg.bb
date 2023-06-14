SUMMARY = "More Image Formats for Tk"
DESCRIPTION = "This package contains a collection of image format handlers for the Tk \
photo image type, and a new image type, pixmaps. \
 \
The provided format handlers include bmp, gif, ico, jpeg, pcx, png, \
ppm, ps, sgi, sun, tga, tiff, xbm, and xpm."
LICENSE = "BSD-3-Clause"

PV = "1.4.13"

RPM_NAME = "tkimg-1.4.13-2.1.aarch64.rpm"
RPM_HASH = "a370ca409190bdc855cc6f9abdc39cfa835060b99d3e44992d3d65d10d666bab7204f832d427a008f1034907ac9cb680ef938e0e0729f42c3c08b98520e29051"

RPROVIDES:${PN} += "libjpegtcl9.4.0.so \
libpngtcl1.6.37.so \
libtifftcl4.1.0.so \
libtkimg1.4.13.so \
libtkimgbmp1.4.13.so \
libtkimgdted1.4.13.so \
libtkimgflir1.4.13.so \
libtkimggif1.4.13.so \
libtkimgico1.4.13.so \
libtkimgjpeg1.4.13.so \
libtkimgpcx1.4.13.so \
libtkimgpixmap1.4.13.so \
libtkimgpng1.4.13.so \
libtkimgppm1.4.13.so \
libtkimgps1.4.13.so \
libtkimgraw1.4.13.so \
libtkimgsgi1.4.13.so \
libtkimgsun1.4.13.so \
libtkimgtga1.4.13.so \
libtkimgtiff1.4.13.so \
libtkimgwindow1.4.13.so \
libtkimgxbm1.4.13.so \
libtkimgxpm1.4.13.so \
libzlibtcl1.2.11.so \
tkimg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libm.so.6"

inherit rpm
