SUMMARY = "OpenCASCADE visualization libraries"
DESCRIPTION = "This package contains the OpenCASCADE libraries from the \
OpenCASCADE visualization module: \
  TKService TKV3D TKOpenGL TKMeshVS"
LICENSE = "LGPL-2.1-only-WITH-OCCT-exception-1.0"

PV = "7.7.0"

RPM_NAME = "libopencascade-visualization7_7-7.7.0-1.3.aarch64.rpm"
RPM_HASH = "eb5d554e15d0859e7a573b81a14e02d55c802e43fa8ea4f4541fa5461c1181b5fcdbeed0fc89fa79cab0b9290932ad70524b943e663faaf13cb51db9ee00a343"

RPROVIDES:${PN} += "libTKMeshVS.so.7.7()(64bit) \
libTKOpenGl.so.7.7()(64bit) \
libTKService.so.7.7()(64bit) \
libTKV3d.so.7.7()(64bit) \
libopencascade-visualization7_7 \
libopencascade-visualization7_7(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libGL.so.1()(64bit) \
libTKBRep.so.7.7()(64bit) \
libTKG2d.so.7.7()(64bit) \
libTKG3d.so.7.7()(64bit) \
libTKGeomAlgo.so.7.7()(64bit) \
libTKGeomBase.so.7.7()(64bit) \
libTKHLR.so.7.7()(64bit) \
libTKMath.so.7.7()(64bit) \
libTKMesh.so.7.7()(64bit) \
libTKTopAlgo.so.7.7()(64bit) \
libTKernel.so.7.7()(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit) \
libfontconfig.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
