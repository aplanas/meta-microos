SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_core-suse3_0_5-3.0.5.1-4.1.aarch64.rpm"
RPM_HASH = "ea56caefbd9d5d096323946d9129c805a9b1a38265306b360a4ed464ad2d0a0a542decebd19c119cf2b368be6447eb259c54ca82fbc1ce6e0612a072b22c9e84"

RPROVIDES:${PN} += "libwx-gtk2u-core-suse.so.3.0.5 \
libwx-gtk2u-core-suse3-0-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSM.so.6 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libjpeg.so.8 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpng16.so.16 \
libstdc++.so.6 \
libtiff.so.6 \
libwx-baseu-suse.so.3.0.5"

inherit rpm
