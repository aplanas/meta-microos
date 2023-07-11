SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_core-suse3_0_5-3.0.5.1-4.2.aarch64.rpm"
RPM_HASH = "b0721c8669ff325df59f9996051740b3caaceefd8189e6fd82b92a3182388dd923cc58e88921dc21361bb3e59ec3cc8f3922cb2f7b76c90ca90d914422c70a7a"

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
