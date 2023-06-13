SUMMARY = "OpenCASCADE modeling algorithms libraries"
DESCRIPTION = "This package contains the OpenCASCADE libraries from the \
OpenCASCADE modeling module: \
  TKGeomAlgo TKTopAlgo TKPrim TKBO TKShHealing TKBool \
  TKHLR TKFillet TKOffset TKFeat TKMesh TKXMesh"
LICENSE = "LGPL-2.1-only-WITH-OCCT-exception-1.0"

PV = "7.7.0"

RPM_NAME = "libopencascade-modelingalgorithms7_7-7.7.0-1.3.aarch64.rpm"
RPM_HASH = "3d6fd6bb5a4b2a4e5138654f2749741123572631d31815472ace1d3ccb553b639672fcb35edcecbec587dd99e3bf8c4cd886ee28e4d8ee707537804cc0c853af"

RPROVIDES:${PN} += "libTKBO.so.7.7()(64bit) \
libTKBool.so.7.7()(64bit) \
libTKFeat.so.7.7()(64bit) \
libTKFillet.so.7.7()(64bit) \
libTKGeomAlgo.so.7.7()(64bit) \
libTKHLR.so.7.7()(64bit) \
libTKMesh.so.7.7()(64bit) \
libTKOffset.so.7.7()(64bit) \
libTKPrim.so.7.7()(64bit) \
libTKShHealing.so.7.7()(64bit) \
libTKTopAlgo.so.7.7()(64bit) \
libTKXMesh.so.7.7()(64bit) \
libopencascade-modelingalgorithms7_7 \
libopencascade-modelingalgorithms7_7(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libTKBRep.so.7.7()(64bit) \
libTKG2d.so.7.7()(64bit) \
libTKG3d.so.7.7()(64bit) \
libTKGeomBase.so.7.7()(64bit) \
libTKMath.so.7.7()(64bit) \
libTKernel.so.7.7()(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
