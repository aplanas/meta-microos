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
fltk-devel \
fltk-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfltk.so.1.3()(64bit) \
libfltk1_3 \
libfltk_forms.so.1.3()(64bit) \
libfltk_images.so.1.3()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
pkgconfig(gl) \
pkgconfig(x11)"

inherit rpm
