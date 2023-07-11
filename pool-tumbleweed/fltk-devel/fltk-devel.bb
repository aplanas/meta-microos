SUMMARY = "Development files for the FLTK GUI toolkit"
DESCRIPTION = "The Fast Light Tool Kit ('FLTK', pronounced 'fulltick') is a C++ \
graphical user interface toolkit for the X Window System, \
OpenGL, and Microsoft Windows NT 4.0, 95, or 98. The \
installation of this package requires a 3D library such as Mesa."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.8"

RPM_NAME = "fltk-devel-1.3.8-3.9.aarch64.rpm"
RPM_HASH = "edd1dd85766b8abcc769a753b5fb366580e214b99288d74d721ce44d81d78340c566bb1f66aa59f0879745dd65f7eb423c9524aca8160d85bb825f409b5b8d90"

RPROVIDES:${PN} += "fltk \
fltk-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
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
