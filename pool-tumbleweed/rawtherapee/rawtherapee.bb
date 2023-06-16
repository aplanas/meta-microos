SUMMARY = "Cross-platform raw image processing program"
DESCRIPTION = "RawTherapee is a cross platform image processing software equipped with the essential tools for high quality and efficient RAW photo development. \
 \
 \
 \
Latest stable build from 'releases' branch."
LICENSE = "GPL-3.0-only"

PV = "5.9"

RPM_NAME = "rawtherapee-5.9-4.2.aarch64.rpm"
RPM_HASH = "7457e1871e18a16bcb71d68a9c9ba0d86ed88cbd2124cc448d5cf90682548b028c7ebc3edf41b57ad1d3d3139dbb7a3931902acb4d6f611221d5cb8d723fbd3b"

RPROVIDES:${PN} += "rawtherapee"

RDEPENDS:${PN} += "/usr/bin/sh \
desktop-file-utils \
ld-linux-aarch64.so.1 \
libatkmm-1.6.so.1 \
libc.so.6 \
libcairomm-1.0.so.1 \
libcanberra-gtk3.so.0 \
libcanberra.so.0 \
libexpat.so.1 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdkmm-3.0.so.1 \
libgiomm-2.4.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgobject-2.0.so.0 \
libgomp.so.1 \
libgtk-3.so.0 \
libgtkmm-3.0.so.1 \
libiptcdata.so.0 \
libjpeg.so.8 \
liblcms2-2 \
liblcms2.so.2 \
liblensfun.so.1 \
libm.so.6 \
libpangomm-1.4.so.1 \
libpng16.so.16 \
librsvg-2.so.2 \
libsigc-2.0.so.0 \
libstdc++.so.6 \
libtiff.so.6 \
libz.so.1"

inherit rpm
