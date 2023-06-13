SUMMARY = "OpenCASCADE Draw support libraries"
DESCRIPTION = "This package contains support libraries for the \
OpenCASCADE DRAWEXE test harness."
LICENSE = "LGPL-2.1-only-WITH-OCCT-exception-1.0"

PV = "7.7.0"

RPM_NAME = "libopencascade-draw7_7-7.7.0-1.3.aarch64.rpm"
RPM_HASH = "06fa717ac14de9aacf10b86dd8892a9157e8c7cf3d1d33095d9db4ae3aaba8e4caf065a736ee0b42afe8bd6d97c7026dd611ed8d55924497721178b1f50cfc00"

RPROVIDES:${PN} += "libTKDCAF.so.7.7()(64bit) \
libTKDraw.so.7.7()(64bit) \
libTKOpenGlTest.so.7.7()(64bit) \
libTKQADraw.so.7.7()(64bit) \
libTKTObjDRAW.so.7.7()(64bit) \
libTKTopTest.so.7.7()(64bit) \
libTKViewerTest.so.7.7()(64bit) \
libTKXDEDRAW.so.7.7()(64bit) \
libTKXSDRAW.so.7.7()(64bit) \
libopencascade-draw7_7 \
libopencascade-draw7_7(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libTKBO.so.7.7()(64bit) \
libTKBRep.so.7.7()(64bit) \
libTKBin.so.7.7()(64bit) \
libTKBinL.so.7.7()(64bit) \
libTKBinTObj.so.7.7()(64bit) \
libTKBinXCAF.so.7.7()(64bit) \
libTKBool.so.7.7()(64bit) \
libTKCAF.so.7.7()(64bit) \
libTKCDF.so.7.7()(64bit) \
libTKFeat.so.7.7()(64bit) \
libTKFillet.so.7.7()(64bit) \
libTKG2d.so.7.7()(64bit) \
libTKG3d.so.7.7()(64bit) \
libTKGeomAlgo.so.7.7()(64bit) \
libTKGeomBase.so.7.7()(64bit) \
libTKHLR.so.7.7()(64bit) \
libTKIGES.so.7.7()(64bit) \
libTKLCAF.so.7.7()(64bit) \
libTKMath.so.7.7()(64bit) \
libTKMesh.so.7.7()(64bit) \
libTKMeshVS.so.7.7()(64bit) \
libTKOffset.so.7.7()(64bit) \
libTKOpenGl.so.7.7()(64bit) \
libTKPrim.so.7.7()(64bit) \
libTKRWMesh.so.7.7()(64bit) \
libTKSTEP.so.7.7()(64bit) \
libTKSTEPBase.so.7.7()(64bit) \
libTKSTL.so.7.7()(64bit) \
libTKService.so.7.7()(64bit) \
libTKShHealing.so.7.7()(64bit) \
libTKStd.so.7.7()(64bit) \
libTKStdL.so.7.7()(64bit) \
libTKTObj.so.7.7()(64bit) \
libTKTopAlgo.so.7.7()(64bit) \
libTKV3d.so.7.7()(64bit) \
libTKVCAF.so.7.7()(64bit) \
libTKVRML.so.7.7()(64bit) \
libTKXCAF.so.7.7()(64bit) \
libTKXDE.so.7.7()(64bit) \
libTKXDECascade.so.7.7()(64bit) \
libTKXDEIGES.so.7.7()(64bit) \
libTKXDESTEP.so.7.7()(64bit) \
libTKXSBase.so.7.7()(64bit) \
libTKXml.so.7.7()(64bit) \
libTKXmlL.so.7.7()(64bit) \
libTKXmlTObj.so.7.7()(64bit) \
libTKXmlXCAF.so.7.7()(64bit) \
libTKernel.so.7.7()(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libtcl8.6.so()(64bit) \
libtk8.6.so()(64bit) \
occt-resources"

inherit rpm
