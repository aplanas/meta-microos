SUMMARY = "Development files for the FLTK GUI toolkit"
DESCRIPTION = "The Fast Light Tool Kit ('FLTK', pronounced 'fulltick') is a C++ \
graphical user interface toolkit for the X Window System, \
OpenGL, and Microsoft Windows NT 4.0, 95, or 98. The \
installation of this package requires a 3D library such as Mesa."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.8"

RPM_NAME = "fltk-devel-1.3.8-3.8.aarch64.rpm"
RPM_HASH = "216316f8e13419268cea82cab4b64343c260926b49e691e3b914b269f407b0bc5b102aa37f7cbb5b99c7c6d49ea7c0c70fada4224f0d0eac728c7a9dd54adcb3"

RPROVIDES:${PN} += "fltk \
fltk-devel"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libfltk-forms.so.1.3 \
libfltk-images.so.1.3 \
libfltk.so.1.3 \
libfltk1-3 \
libpng16.so.16 \
libstdc++.so.6 \
pkgconfig-gl \
pkgconfig-x11"

inherit rpm
