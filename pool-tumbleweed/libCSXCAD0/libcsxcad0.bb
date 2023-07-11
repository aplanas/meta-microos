SUMMARY = "A C++ library to describe geometrical objects and their properties"
DESCRIPTION = "CSXCAD is a C++ library to describe geometrical objects and their physical \
or non-physical properties."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6.2"

RPM_NAME = "libCSXCAD0-0.6.2-3.20.aarch64.rpm"
RPM_HASH = "fa8cf0b43fdd44c01e0227e93c695b0a67b394cb832fccd8eee646b3b3d15e55e0a0a568a9b7dd88ca350577042beabded2a68cfde99861dee7dcb0e778dc423"

RPROVIDES:${PN} += "libCSXCAD.so.0 \
libCSXCAD0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfparser-4.5.2.so \
libgcc-s.so.1 \
libhdf5-hl.so.200 \
libhdf5.so.200 \
libm.so.6 \
libstdc++.so.6 \
libtinyxml.so.0 \
libvtkCommonCore.so.1 \
libvtkCommonDataModel.so.1 \
libvtkCommonExecutionModel.so.1 \
libvtkCommonMath.so.1 \
libvtkIOGeometry.so.1 \
libvtkIOPLY.so.1 \
libvtksys.so.1"

inherit rpm
