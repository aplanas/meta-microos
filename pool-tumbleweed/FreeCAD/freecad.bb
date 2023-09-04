SUMMARY = "General Purpose 3D CAD Modeler"
DESCRIPTION = "FreeCAD is a parametric 3D modeler made primarily to design real-life objects \
of any size. Parametric modeling allows modifying designs by \
going back into the model history and changing its parameters. FreeCAD is \
customizable and scriptable."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "0.21.0"

RPM_NAME = "FreeCAD-0.21.0-1.1.aarch64.rpm"
RPM_HASH = "dfc5c92bb279c71084413f6f8861f953d66492f89631134e68b27645be549c14ec09eb7f2a59348a25d674837adc92fd13b2943b0431225da3b74aac81d65544"

RPROVIDES:${PN} += "FreeCAD \
freecad \
libDriver.so \
libDriverDAT.so \
libDriverSTL.so \
libDriverUNV.so \
libE57Format.so \
libFreeCADApp.so \
libFreeCADBase.so \
libFreeCADGui.so \
libMEFISTO2.so \
libNETGENPlugin.so \
libSMDS.so \
libSMESH.so \
libSMESHDS.so \
libStdMeshers.so \
libarea-native.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libCoin.so.80 \
libGL.so.1 \
libGLESv2.so.2 \
libQt5Concurrent.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Svg.so.5 \
libQt5WebEngineCore.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libTKBO.so.7.7 \
libTKBRep.so.7.7 \
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
libTKPrim.so.7.7 \
libTKRWMesh.so.7.7 \
libTKSTEP.so.7.7 \
libTKSTEP209.so.7.7 \
libTKSTEPAttr.so.7.7 \
libTKSTEPBase.so.7.7 \
libTKSTL.so.7.7 \
libTKShHealing.so.7.7 \
libTKTopAlgo.so.7.7 \
libTKXCAF.so.7.7 \
libTKXDEIGES.so.7.7 \
libTKXDESTEP.so.7.7 \
libTKXSBase.so.7.7 \
libTKernel.so.7.7 \
libboost-filesystem.so.1.82.0 \
libboost-program-options.so.1.82.0 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libfmt.so.9 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libmedC.so.11 \
libngcore.so \
libnglib.so \
libpyside2.cpython-311-aarch64-linux-gnu.so.5.15 \
libpython3.11.so.1.0 \
libshiboken2.cpython-311-aarch64-linux-gnu.so.5.15 \
libspnav.so.0 \
libstdc++.so.6 \
libvtkCommonCore.so.1 \
libvtkCommonDataModel.so.1 \
libvtkCommonExecutionModel.so.1 \
libvtkCommonMisc.so.1 \
libvtkFiltersCore.so.1 \
libvtkFiltersExtraction.so.1 \
libvtkFiltersGeneral.so.1 \
libvtkFiltersGeometry.so.1 \
libvtkFiltersSources.so.1 \
libvtkFiltersVerdict.so.1 \
libvtkIOCore.so.1 \
libvtkIOLegacy.so.1 \
libvtkIOXML.so.1 \
libvtksys.so.1 \
libxerces-c-3.2.so \
libz.so.1 \
python3-PyYAML \
python3-matplotlib-qt5 \
python3-numpy \
python3-pivy \
python3-ply \
python3-pyside2 \
python3-six \
python3-vtk"

inherit rpm
