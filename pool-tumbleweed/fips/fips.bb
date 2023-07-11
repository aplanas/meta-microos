SUMMARY = "OpenGL-based FITS image viewer"
DESCRIPTION = "FIPS is a cross-platform FITS viewer with responsive user interface. Unlike \
other FITS viewers FIPS uses GPU hardware via OpenGL to provide usual \
functionality such as zooming, panning and level adjustments. OpenGL 2.1 and \
later is supported. \
 \
FIPS supports all 2D image formats except of 64-bit floating point numbers \
(BITPIX=-64). FITS image extension has basic limited support."
LICENSE = "LGPL-3.0-only"

PV = "3.4.0"

RPM_NAME = "fips-3.4.0-1.17.aarch64.rpm"
RPM_HASH = "a9b3609781b07fae452f323ca4535ec08bd6283dcb98384b211c915dcc6d2a7a6b56f0f0c6f1b83e9861fcd935a402dd6c5d7ed36ca9b1afe9750b2f893ced6f"

RPROVIDES:${PN} += "fips"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
