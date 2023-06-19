SUMMARY = "OpenCASCADE modeling data libraries"
DESCRIPTION = "This package contains the OpenCASCADE libraries from the \
OpenCASCADE modeling module: \
  TKG2d TKG3d TKGeomBase TKBRep"
LICENSE = "LGPL-2.1-only-with-OCCT-exception-1.0"

PV = "7.7.0"

RPM_NAME = "libopencascade-modelingdata7_7-7.7.0-1.3.aarch64.rpm"
RPM_HASH = "c9bd2643cec41d6777714317f26fa66f8785dcec7b041e129f2f2a84809cddf3cc6930108c3f1d66bbd4547e289b1a12d799160e249d111466ee3f143b086819"

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
