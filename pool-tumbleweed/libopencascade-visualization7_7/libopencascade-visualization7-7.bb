SUMMARY = "OpenCASCADE visualization libraries"
DESCRIPTION = "This package contains the OpenCASCADE libraries from the \
OpenCASCADE visualization module: \
  TKService TKV3D TKOpenGL TKMeshVS"
LICENSE = "LGPL-2.1-only-with-OCCT-exception-1.0"

PV = "7.7.0"

RPM_NAME = "libopencascade-visualization7_7-7.7.0-1.3.aarch64.rpm"
RPM_HASH = "eb5d554e15d0859e7a573b81a14e02d55c802e43fa8ea4f4541fa5461c1181b5fcdbeed0fc89fa79cab0b9290932ad70524b943e663faaf13cb51db9ee00a343"

RPROVIDES:${PN} += "libTKMeshVS.so.7.7 \
libTKOpenGl.so.7.7 \
libTKService.so.7.7 \
libTKV3d.so.7.7 \
libopencascade-visualization7-7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libTKBRep.so.7.7 \
libTKG2d.so.7.7 \
libTKG3d.so.7.7 \
libTKGeomAlgo.so.7.7 \
libTKGeomBase.so.7.7 \
libTKHLR.so.7.7 \
libTKMath.so.7.7 \
libTKMesh.so.7.7 \
libTKTopAlgo.so.7.7 \
libTKernel.so.7.7 \
libX11.so.6 \
libc.so.6 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
