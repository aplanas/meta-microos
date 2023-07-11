SUMMARY = "Really Slick Screensavers Port to GLX"
DESCRIPTION = "Cool collection of 3D screensavers. Linux port of Really Slick Screensavers"
LICENSE = "GPL-2.0-only & GPL-3.0-only"

PV = "0.9.1"

RPM_NAME = "rss-glx-0.9.1-23.11.aarch64.rpm"
RPM_HASH = "387413e82290d1dcb461ee0aafc3785ad0cd9e7a15d9a66816c6ccac0c1701e74e6b5681a0f2952b9be531f7ce3eef1120acadc9308761728b72b2925d97740d"

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
