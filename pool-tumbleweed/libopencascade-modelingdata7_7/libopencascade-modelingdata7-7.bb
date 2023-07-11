SUMMARY = "OpenCASCADE modeling data libraries"
DESCRIPTION = "This package contains the OpenCASCADE libraries from the \
OpenCASCADE modeling module: \
  TKG2d TKG3d TKGeomBase TKBRep"
LICENSE = "LGPL-2.1-only-with-OCCT-exception-1.0"

PV = "7.7.0"

RPM_NAME = "libopencascade-modelingdata7_7-7.7.0-1.4.aarch64.rpm"
RPM_HASH = "c2dd1c1ed2e4a4dbf65ee5fb7d1cd181e17cf046fa41c9f6c1efbdc75497df4799be19eb6459734e995041aaaf0c20130b54b972fcf7a5a9e93c3e84af243ab9"

RPROVIDES:${PN} += "libTKBRep.so.7.7 \
libTKG2d.so.7.7 \
libTKG3d.so.7.7 \
libTKGeomBase.so.7.7 \
libopencascade-modelingdata7-7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libTKMath.so.7.7 \
libTKernel.so.7.7 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
