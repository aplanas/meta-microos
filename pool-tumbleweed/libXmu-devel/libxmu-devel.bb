SUMMARY = "Development files for the X Miscellaneous Utility Libraries"
DESCRIPTION = "The Xmu/Xmuu libraries are a collection of miscellaneous (some might \
say random) utility functions that have been useful in building \
various applications and widgets. \
 \
This package contains the development headers for the library found \
in libXmu6 and libXmuu1."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "libXmu-devel-1.1.4-1.3.aarch64.rpm"
RPM_HASH = "84f135f841e15e1c669147fde3726f294cd5e4487aeb217ccff881dc38f746e0f8c1b5e65e0c94a82e2f5885d259902291fa96a1de7e43abd95269c665cddcb1"

RPROVIDES:${PN} += "libXmu-devel \
pkgconfig-xmu \
pkgconfig-xmuu \
xorg-x11-libXmu-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXmu6 \
libXmuu1 \
pkgconfig-x11 \
pkgconfig-xext \
pkgconfig-xproto \
pkgconfig-xt \
xbitmaps-devel"

inherit rpm
