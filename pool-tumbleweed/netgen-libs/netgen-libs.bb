SUMMARY = "NETGEN mesher libraries"
DESCRIPTION = "NETGEN mesh generator shared libraries."
LICENSE = "LGPL-2.1-only"

PV = "6.2.2301"

RPM_NAME = "netgen-libs-6.2.2301-1.4.aarch64.rpm"
RPM_HASH = "ca767c3a0504a07c6ac7011ea6bab598d2d0c50998205452b34eeffcc72a723bcd152542cf54b8ffa688d051cf43d940d44c542edd816d5f855e83eea0a43b58"

RPROVIDES:${PN} += "libngcore.so()(64bit) \
libnglib.so()(64bit) \
netgen-libs \
netgen-libs(aarch-64) \
netgen:/usr/lib64/netgen/libngcore.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libTKBO.so.7.7()(64bit) \
libTKBRep.so.7.7()(64bit) \
libTKBool.so.7.7()(64bit) \
libTKFillet.so.7.7()(64bit) \
libTKG2d.so.7.7()(64bit) \
libTKG3d.so.7.7()(64bit) \
libTKGeomAlgo.so.7.7()(64bit) \
libTKGeomBase.so.7.7()(64bit) \
libTKIGES.so.7.7()(64bit) \
libTKLCAF.so.7.7()(64bit) \
libTKMath.so.7.7()(64bit) \
libTKMesh.so.7.7()(64bit) \
libTKOffset.so.7.7()(64bit) \
libTKPrim.so.7.7()(64bit) \
libTKSTEP.so.7.7()(64bit) \
libTKSTEPBase.so.7.7()(64bit) \
libTKSTL.so.7.7()(64bit) \
libTKShHealing.so.7.7()(64bit) \
libTKTopAlgo.so.7.7()(64bit) \
libTKXCAF.so.7.7()(64bit) \
libTKXDEIGES.so.7.7()(64bit) \
libTKXDESTEP.so.7.7()(64bit) \
libTKXSBase.so.7.7()(64bit) \
libTKernel.so.7.7()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libpython3.10.so.1.0()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
