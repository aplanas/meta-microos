SUMMARY = "OpenCASCADE visualization libraries"
DESCRIPTION = "This package contains the OpenCASCADE libraries from the \
OpenCASCADE visualization module: \
  TKService TKV3D TKOpenGL TKMeshVS"
LICENSE = "LGPL-2.1-only-with-OCCT-exception-1.0"

PV = "7.7.0"

RPM_NAME = "libopencascade-visualization7_7-7.7.0-1.4.aarch64.rpm"
RPM_HASH = "1d075552d919a20822f4df6c67b6b1c4effb7e2cb89cc0e76e604daeb7027b1cafc036c07365b66dd76a4e8443f3e6fc014d5c57077ddc5c2fee63f47b0b4604"

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
