SUMMARY = "OpenCASCADE modeling algorithms libraries"
DESCRIPTION = "This package contains the OpenCASCADE libraries from the \
OpenCASCADE modeling module: \
  TKGeomAlgo TKTopAlgo TKPrim TKBO TKShHealing TKBool \
  TKHLR TKFillet TKOffset TKFeat TKMesh TKXMesh"
LICENSE = "LGPL-2.1-only-with-OCCT-exception-1.0"

PV = "7.7.0"

RPM_NAME = "libopencascade-modelingalgorithms7_7-7.7.0-1.4.aarch64.rpm"
RPM_HASH = "486b177863b05e1b920cb63b23b157915cb9894726f16d520bace4e35cbe991c2ac2a8e40c0eb863f40796d383f9bf8ee074747fdda46ddc74a2be6718bbea10"

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
