SUMMARY = "OpenCASCADE Community Edition"
DESCRIPTION = "OpenCASCADE is a suite for 3D surface and solid modeling, visualization, data \
exchange and rapid application development. It is a platform for \
development of numerical simulation software including CAD/CAM/CAE, AEC and \
GIS, as well as PDM applications."
LICENSE = "LGPL-2.1-only-WITH-OCCT-exception-1.0"

PV = "0.18.3"

RPM_NAME = "oce-0.18.3-3.3.aarch64.rpm"
RPM_HASH = "c158b8edd9909b75e5eae79d89467c654f50043d2aae0bdfbfd4dd683f3de439733495bbea3320b1c8834937f9c82bed2e3886593333731b00e6477a85638975"

RPROVIDES:${PN} += "OCE \
OpenCASCADE \
libFWOSPlugin.so.11()(64bit) \
libPTKernel.so.11()(64bit) \
libTKBO.so.11()(64bit) \
libTKBRep.so.11()(64bit) \
libTKBin.so.11()(64bit) \
libTKBinL.so.11()(64bit) \
libTKBinTObj.so.11()(64bit) \
libTKBinXCAF.so.11()(64bit) \
libTKBool.so.11()(64bit) \
libTKCAF.so.11()(64bit) \
libTKCDF.so.11()(64bit) \
libTKDCAF.so.11()(64bit) \
libTKDraw.so.11()(64bit) \
libTKFeat.so.11()(64bit) \
libTKFillet.so.11()(64bit) \
libTKG2d.so.11()(64bit) \
libTKG3d.so.11()(64bit) \
libTKGeomAlgo.so.11()(64bit) \
libTKGeomBase.so.11()(64bit) \
libTKHLR.so.11()(64bit) \
libTKIGES.so.11()(64bit) \
libTKLCAF.so.11()(64bit) \
libTKMath.so.11()(64bit) \
libTKMesh.so.11()(64bit) \
libTKMeshVS.so.11()(64bit) \
libTKNIS.so.11()(64bit) \
libTKOffset.so.11()(64bit) \
libTKOpenGl.so.11()(64bit) \
libTKPCAF.so.11()(64bit) \
libTKPLCAF.so.11()(64bit) \
libTKPShape.so.11()(64bit) \
libTKPrim.so.11()(64bit) \
libTKSTEP.so.11()(64bit) \
libTKSTEP209.so.11()(64bit) \
libTKSTEPAttr.so.11()(64bit) \
libTKSTEPBase.so.11()(64bit) \
libTKSTL.so.11()(64bit) \
libTKService.so.11()(64bit) \
libTKShHealing.so.11()(64bit) \
libTKShapeSchema.so.11()(64bit) \
libTKStdLSchema.so.11()(64bit) \
libTKStdSchema.so.11()(64bit) \
libTKTObj.so.11()(64bit) \
libTKTObjDRAW.so.11()(64bit) \
libTKTopAlgo.so.11()(64bit) \
libTKTopTest.so.11()(64bit) \
libTKV3d.so.11()(64bit) \
libTKVRML.so.11()(64bit) \
libTKViewerTest.so.11()(64bit) \
libTKVoxel.so.11()(64bit) \
libTKXCAF.so.11()(64bit) \
libTKXCAFSchema.so.11()(64bit) \
libTKXDEDRAW.so.11()(64bit) \
libTKXDEIGES.so.11()(64bit) \
libTKXDESTEP.so.11()(64bit) \
libTKXMesh.so.11()(64bit) \
libTKXSBase.so.11()(64bit) \
libTKXSDRAW.so.11()(64bit) \
libTKXml.so.11()(64bit) \
libTKXmlL.so.11()(64bit) \
libTKXmlTObj.so.11()(64bit) \
libTKXmlXCAF.so.11()(64bit) \
libTKernel.so.11()(64bit) \
oce \
oce(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libGL.so.1()(64bit) \
libGLU.so.1()(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit) \
libfreetype.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgomp.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libtcl8.6.so()(64bit) \
libtk8.6.so()(64bit)"

inherit rpm
