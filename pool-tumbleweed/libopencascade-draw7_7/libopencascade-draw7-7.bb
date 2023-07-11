SUMMARY = "OpenCASCADE Draw support libraries"
DESCRIPTION = "This package contains support libraries for the \
OpenCASCADE DRAWEXE test harness."
LICENSE = "LGPL-2.1-only-with-OCCT-exception-1.0"

PV = "7.7.0"

RPM_NAME = "libopencascade-draw7_7-7.7.0-1.4.aarch64.rpm"
RPM_HASH = "5824a8e527a359d7ddbb33d40b21ecc2436c5847ec64d83bc69cfacbc9d2bf1e665b5b36675ccb9831339acf7ef093138a8a065d436a8b6ffe56b4ae83247c6d"

RPROVIDES:${PN} += "libTKDCAF.so.7.7 \
libTKDraw.so.7.7 \
libTKOpenGlTest.so.7.7 \
libTKQADraw.so.7.7 \
libTKTObjDRAW.so.7.7 \
libTKTopTest.so.7.7 \
libTKViewerTest.so.7.7 \
libTKXDEDRAW.so.7.7 \
libTKXSDRAW.so.7.7 \
libopencascade-draw7-7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libTKBO.so.7.7 \
libTKBRep.so.7.7 \
libTKBin.so.7.7 \
libTKBinL.so.7.7 \
libTKBinTObj.so.7.7 \
libTKBinXCAF.so.7.7 \
libTKBool.so.7.7 \
libTKCAF.so.7.7 \
libTKCDF.so.7.7 \
libTKFeat.so.7.7 \
libTKFillet.so.7.7 \
libTKG2d.so.7.7 \
libTKG3d.so.7.7 \
libTKGeomAlgo.so.7.7 \
libTKGeomBase.so.7.7 \
libTKHLR.so.7.7 \
libTKIGES.so.7.7 \
libTKLCAF.so.7.7 \
libTKMath.so.7.7 \
libTKMesh.so.7.7 \
libTKMeshVS.so.7.7 \
libTKOffset.so.7.7 \
libTKOpenGl.so.7.7 \
libTKPrim.so.7.7 \
libTKRWMesh.so.7.7 \
libTKSTEP.so.7.7 \
libTKSTEPBase.so.7.7 \
libTKSTL.so.7.7 \
libTKService.so.7.7 \
libTKShHealing.so.7.7 \
libTKStd.so.7.7 \
libTKStdL.so.7.7 \
libTKTObj.so.7.7 \
libTKTopAlgo.so.7.7 \
libTKV3d.so.7.7 \
libTKVCAF.so.7.7 \
libTKVRML.so.7.7 \
libTKXCAF.so.7.7 \
libTKXDE.so.7.7 \
libTKXDECascade.so.7.7 \
libTKXDEIGES.so.7.7 \
libTKXDESTEP.so.7.7 \
libTKXSBase.so.7.7 \
libTKXml.so.7.7 \
libTKXmlL.so.7.7 \
libTKXmlTObj.so.7.7 \
libTKXmlXCAF.so.7.7 \
libTKernel.so.7.7 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtcl8.6.so \
libtk8.6.so \
occt-resources"

inherit rpm
