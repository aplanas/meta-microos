SUMMARY = "A C++ library to describe geometrical objects and their properties"
DESCRIPTION = "CSXCAD is a C++ library to describe geometrical objects and their physical \
or non-physical properties."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6.2"

RPM_NAME = "libCSXCAD0-0.6.2-3.19.aarch64.rpm"
RPM_HASH = "d9c371d0a67b5266838c6654218f2679fe3c727c7ac5dab4901b3e6af35de97e9aa793156aaef6ec0ab0673b9d8dd9e9a36c119caa4723d31b3dbae64e5ed552"

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
