SUMMARY = "OpenCASCADE modeling algorithms libraries"
DESCRIPTION = "This package contains the OpenCASCADE libraries from the \
OpenCASCADE modeling module: \
  TKGeomAlgo TKTopAlgo TKPrim TKBO TKShHealing TKBool \
  TKHLR TKFillet TKOffset TKFeat TKMesh TKXMesh"
LICENSE = "LGPL-2.1-only-with-OCCT-exception-1.0"

PV = "7.7.0"

RPM_NAME = "libopencascade-modelingalgorithms7_7-7.7.0-1.3.aarch64.rpm"
RPM_HASH = "3d6fd6bb5a4b2a4e5138654f2749741123572631d31815472ace1d3ccb553b639672fcb35edcecbec587dd99e3bf8c4cd886ee28e4d8ee707537804cc0c853af"

RPROVIDES:${PN} += "libTKBO.so.7.7 \
libTKBool.so.7.7 \
libTKFeat.so.7.7 \
libTKFillet.so.7.7 \
libTKGeomAlgo.so.7.7 \
libTKHLR.so.7.7 \
libTKMesh.so.7.7 \
libTKOffset.so.7.7 \
libTKPrim.so.7.7 \
libTKShHealing.so.7.7 \
libTKTopAlgo.so.7.7 \
libTKXMesh.so.7.7 \
libopencascade-modelingalgorithms7-7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libTKBRep.so.7.7 \
libTKG2d.so.7.7 \
libTKG3d.so.7.7 \
libTKGeomBase.so.7.7 \
libTKMath.so.7.7 \
libTKernel.so.7.7 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
