SUMMARY = "Really Slick Screensavers Port to GLX"
DESCRIPTION = "Cool collection of 3D screensavers. Linux port of Really Slick Screensavers"
LICENSE = "GPL-2.0-only & GPL-3.0-only"

PV = "0.9.1"

RPM_NAME = "rss-glx-0.9.1-23.10.aarch64.rpm"
RPM_HASH = "c0e9d6316990816d2f8cb0e6099b9dd8125febb3799d648a3c5bf6db3f6d19b3687a96ea3f2099d87d0524a6c406c24ae4efa3ebe5d216242a1dda44915b946b"

RPROVIDES:${PN} += "config-rss-glx \
libImplicit.so.0 \
libPixelCity.so.0 \
librsMath.so.0 \
rss-glx"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libMagickCore-7.Q16HDRI.so.10 \
libMagickWand-7.Q16HDRI.so.10 \
libX11.so.6 \
libalut.so.0 \
libbz2.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopenal.so.1 \
libstdc++.so.6"

inherit rpm
