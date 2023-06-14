SUMMARY = "A three-dimensional finite element mesh generator"
DESCRIPTION = "Gmsh is a 3D finite element grid generator with a build-in CAD engine \
and post-processor. \
 \
This package contains the shared libraries."
LICENSE = "GPL-2.0-or-later"

PV = "4.11.1"

RPM_NAME = "libgmsh4_11-4.11.1-2.1.aarch64.rpm"
RPM_HASH = "bc32297f0b04593fb890660c44f01da84953e5089cacd8528c4d18170e02fc29e4b48905b4afdfd7227c132e448bf7d5e2f4794935e7d6041f5425b2ebd4f6be"

RPROVIDES:${PN} += "libgmsh.so.4.11 \
libgmsh4-11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libTKBO.so.7.7 \
libTKBRep.so.7.7 \
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
libTKShHealing.so.7.7 \
libTKTopAlgo.so.7.7 \
libTKXCAF.so.7.7 \
libTKXDEIGES.so.7.7 \
libTKXDESTEP.so.7.7 \
libTKXSBase.so.7.7 \
libTKernel.so.7.7 \
libX11.so.6 \
libc.so.6 \
libcgns.so.4.3 \
libfltk-gl.so.1.3 \
libfltk-images.so.1.3 \
libfltk.so.1.3 \
libgcc-s.so.1 \
libgl2ps.so.1 \
libgl2ps1 \
libgmp.so.10 \
libgomp.so.1 \
libjpeg.so.8 \
libm.so.6 \
libmetis.so.5 \
libpng16.so.16 \
libstdc++.so.6"

inherit rpm
