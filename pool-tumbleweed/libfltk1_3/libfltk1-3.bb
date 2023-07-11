SUMMARY = "The FLTK GUI toolkit library"
DESCRIPTION = "The Fast Light Tool Kit ('FLTK', pronounced 'fulltick') is a C++ \
graphical user interface toolkit for the X Window System, \
OpenGL, and Microsoft Windows NT 4.0, 95, or 98. The \
installation of this package requires a 3D library such as Mesa."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.8"

RPM_NAME = "libfltk1_3-1.3.8-3.9.aarch64.rpm"
RPM_HASH = "ffac23821d23be36c5044e4dc207fbbc6e28fcb62dea4054b4e3ce4dcbbfbbc955c47a8bb15d459b0cdacbaf7ef83840343cf87f75e3b055627a619ea1f7189d"

RPROVIDES:${PN} += "libfltk-forms.so.1.3 \
libfltk-gl.so.1.3 \
libfltk-images.so.1.3 \
libfltk.so.1.3 \
libfltk1-3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libX11.so.6 \
libXcursor.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXft.so.2 \
libXinerama.so.1 \
libXrender.so.1 \
libc.so.6 \
libfontconfig.so.1 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6"

inherit rpm
