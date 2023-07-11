SUMMARY = "Static libraries for the FLTK GUI toolkit"
DESCRIPTION = "The Fast Light Tool Kit ('FLTK', pronounced 'fulltick') is a C++ \
graphical user interface toolkit for the X Window System, \
OpenGL, and Microsoft Windows NT 4.0, 95, or 98. The \
installation of this package requires a 3D library such as Mesa."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.8"

RPM_NAME = "fltk-devel-static-1.3.8-3.9.aarch64.rpm"
RPM_HASH = "cafee06e452e2652600bcdb1692bc9c0766ba0edd5df92b0f34c7da35496b7194a7d8b526b39594a3074b64478dc68c61a88103ca2705fca67b709d1d6e2c5d4"

RPROVIDES:${PN} += "fltk-devel-static"

RDEPENDS:${PN} += "fltk-devel \
libfltk1-3"

inherit rpm
