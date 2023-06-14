SUMMARY = "NETGEN mesher libraries"
DESCRIPTION = "NETGEN mesh generator shared libraries."
LICENSE = "LGPL-2.1-only"

PV = "6.2.2301"

RPM_NAME = "netgen-libs-6.2.2301-1.4.aarch64.rpm"
RPM_HASH = "ca767c3a0504a07c6ac7011ea6bab598d2d0c50998205452b34eeffcc72a723bcd152542cf54b8ffa688d051cf43d940d44c542edd816d5f855e83eea0a43b58"

RPROVIDES:${PN} += "libngcore.so \
libnglib.so \
netgen-/usr/lib64/netgen/libngcore.so \
netgen-libs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libTKBO.so.7.7 \
libTKBRep.so.7.7 \
libTKBool.so.7.7 \
libTKFillet.so.7.7 \
libTKG2d.so.7.7 \
libTKG3d.so.7.7 \
libTKGeomAlgo.so.7.7 \
libTKGeomBase.so.7.7 \
libTKIGES.so.7.7 \
libTKLCAF.so.7.7 \
libTKMath.so.7.7 \
libTKMesh.so.7.7 \
libTKOffset.so.7.7 \
libTKPrim.so.7.7 \
libTKSTEP.so.7.7 \
libTKSTEPBase.so.7.7 \
libTKSTL.so.7.7 \
libTKShHealing.so.7.7 \
libTKTopAlgo.so.7.7 \
libTKXCAF.so.7.7 \
libTKXDEIGES.so.7.7 \
libTKXDESTEP.so.7.7 \
libTKXSBase.so.7.7 \
libTKernel.so.7.7 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpython3.10.so.1.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
