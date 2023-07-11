SUMMARY = "Constructive Solid Geometry rendering library"
DESCRIPTION = "OpenCSG is a library that does image-based Constructive Solid \
Geometry rendering using OpenGL. CSG denotes an approach to model 3D \
shapes by applying operations such as union, intersection or \
subtraction to so-called primtives, the latter of which are solid \
(i.e. have a clearly defined interior and exterior)."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.1"

RPM_NAME = "libopencsg1-1.5.1-1.4.aarch64.rpm"
RPM_HASH = "48f4e7bfc5324bb7750d74d3f0f69f98a79ec9c7638e11443836261db5f4c18ff5d47fa94535db4d0b66c7e734809f1991ff11ce3eaaeba6b6f6795ad0133b19"

RPROVIDES:${PN} += "libopencsg.so.1 \
libopencsg1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libGL.so.1 \
libGLEW.so.2.2 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
