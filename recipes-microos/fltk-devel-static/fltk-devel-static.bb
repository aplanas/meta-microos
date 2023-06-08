SUMMARY = "Static libraries for the FLTK GUI toolkit"
DESCRIPTION = "The Fast Light Tool Kit ('FLTK', pronounced 'fulltick') is a C++ \
graphical user interface toolkit for the X Window System, \
OpenGL, and Microsoft Windows NT 4.0, 95, or 98. The \
installation of this package requires a 3D library such as Mesa."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.8"

RPM_NAME = "fltk-devel-static-1.3.8-3.8.aarch64.rpm"
RPM_HASH = "7611917a3d2707d57792e0fac246a29d23f6993b212beee6d6f0205e36e4743c0c88ce9764bb86b6f53ecc22606c7270e8960e566cdea5ef03e8ac12d7ccb847"

RPROVIDES:${PN} += "fltk-devel-static fltk-devel-static(aarch-64)"
RDEPENDS:${PN} += "fltk-devel libfltk1_3"

inherit rpm
