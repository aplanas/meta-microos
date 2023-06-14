SUMMARY = "The FLTK GUI toolkit library"
DESCRIPTION = "The Fast Light Tool Kit ('FLTK', pronounced 'fulltick') is a C++ \
graphical user interface toolkit for the X Window System, \
OpenGL, and Microsoft Windows NT 4.0, 95, or 98. The \
installation of this package requires a 3D library such as Mesa."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.8"

RPM_NAME = "libfltk1_3-1.3.8-3.8.aarch64.rpm"
RPM_HASH = "63d8eb24d69432286f1ea21c5dbb4e2d66cab9aca1f63f169162af427c572fd189279c44c52a720a65ae0d55197bc5fb1a4edfac9a98131c2d8707c437fcc317"

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
