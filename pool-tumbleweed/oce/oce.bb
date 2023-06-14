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
libFWOSPlugin.so.11 \
libPTKernel.so.11 \
libTKBO.so.11 \
libTKBRep.so.11 \
libTKBin.so.11 \
libTKBinL.so.11 \
libTKBinTObj.so.11 \
libTKBinXCAF.so.11 \
libTKBool.so.11 \
libTKCAF.so.11 \
libTKCDF.so.11 \
libTKDCAF.so.11 \
libTKDraw.so.11 \
libTKFeat.so.11 \
libTKFillet.so.11 \
libTKG2d.so.11 \
libTKG3d.so.11 \
libTKGeomAlgo.so.11 \
libTKGeomBase.so.11 \
libTKHLR.so.11 \
libTKIGES.so.11 \
libTKLCAF.so.11 \
libTKMath.so.11 \
libTKMesh.so.11 \
libTKMeshVS.so.11 \
libTKNIS.so.11 \
libTKOffset.so.11 \
libTKOpenGl.so.11 \
libTKPCAF.so.11 \
libTKPLCAF.so.11 \
libTKPShape.so.11 \
libTKPrim.so.11 \
libTKSTEP.so.11 \
libTKSTEP209.so.11 \
libTKSTEPAttr.so.11 \
libTKSTEPBase.so.11 \
libTKSTL.so.11 \
libTKService.so.11 \
libTKShHealing.so.11 \
libTKShapeSchema.so.11 \
libTKStdLSchema.so.11 \
libTKStdSchema.so.11 \
libTKTObj.so.11 \
libTKTObjDRAW.so.11 \
libTKTopAlgo.so.11 \
libTKTopTest.so.11 \
libTKV3d.so.11 \
libTKVRML.so.11 \
libTKViewerTest.so.11 \
libTKVoxel.so.11 \
libTKXCAF.so.11 \
libTKXCAFSchema.so.11 \
libTKXDEDRAW.so.11 \
libTKXDEIGES.so.11 \
libTKXDESTEP.so.11 \
libTKXMesh.so.11 \
libTKXSBase.so.11 \
libTKXSDRAW.so.11 \
libTKXml.so.11 \
libTKXmlL.so.11 \
libTKXmlTObj.so.11 \
libTKXmlXCAF.so.11 \
libTKernel.so.11 \
oce"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libX11.so.6 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtcl8.6.so \
libtk8.6.so"

inherit rpm
