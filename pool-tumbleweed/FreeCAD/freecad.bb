SUMMARY = "General Purpose 3D CAD Modeler"
DESCRIPTION = "FreeCAD is a parametric 3D modeler made primarily to design real-life objects \
of any size. Parametric modeling allows modifying designs by \
going back into the model history and changing its parameters. FreeCAD is \
customizable and scriptable."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "0.20.1"

RPM_NAME = "FreeCAD-0.20.1-1.3.aarch64.rpm"
RPM_HASH = "2dc860e435b67c277908816ff2f918589bf513f8ea165e3ecd3a0526e92c5571db5a65730de2fd4f5cb451c4157a779300a93e4ceafad2a4df9ab74c012b38b2"

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
libGLU.so.1 \
libQt5Concurrent.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5OpenGL.so.5 \
libQt5PrintSupport.so.5 \
libQt5Svg.so.5 \
libQt5WebEngineCore.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libQt5XmlPatterns.so.5 \
libTKBO.so.7.6 \
libTKBRep.so.7.6 \
libTKBool.so.7.6 \
libTKCAF.so.7.6 \
libTKCDF.so.7.6 \
libTKFeat.so.7.6 \
libTKFillet.so.7.6 \
libTKG2d.so.7.6 \
libTKG3d.so.7.6 \
libTKGeomAlgo.so.7.6 \
libTKGeomBase.so.7.6 \
libTKHLR.so.7.6 \
libTKIGES.so.7.6 \
libTKLCAF.so.7.6 \
libTKMath.so.7.6 \
libTKMesh.so.7.6 \
libTKMeshVS.so.7.6 \
libTKOffset.so.7.6 \
libTKPrim.so.7.6 \
libTKRWMesh.so.7.6 \
libTKSTEP.so.7.6 \
libTKSTEP209.so.7.6 \
libTKSTEPAttr.so.7.6 \
libTKSTEPBase.so.7.6 \
libTKSTL.so.7.6 \
libTKShHealing.so.7.6 \
libTKTopAlgo.so.7.6 \
libTKXCAF.so.7.6 \
libTKXDEIGES.so.7.6 \
libTKXDESTEP.so.7.6 \
libTKXSBase.so.7.6 \
libTKernel.so.7.6 \
libboost-filesystem.so.1.80.0 \
libboost-program-options.so.1.80.0 \
libboost-thread.so.1.80.0 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libmedC.so.11 \
libngcore.so \
libnglib.so \
libpyside2.cpython-310-aarch64-linux-gnu.so.5.15 \
libpython3.10.so.1.0 \
libshiboken2.cpython-310-aarch64-linux-gnu.so.5.15 \
libspnav.so.0 \
libstdc++.so.6 \
libvtkCommonCore.so.1 \
libvtkCommonDataModel.so.1 \
libvtkCommonExecutionModel.so.1 \
libvtkFiltersCore.so.1 \
libvtkFiltersExtraction.so.1 \
libvtkFiltersGeneral.so.1 \
libvtkFiltersGeometry.so.1 \
libvtkFiltersSources.so.1 \
libvtkFiltersVerdict.so.1 \
libvtkIOCore.so.1 \
libvtkIOLegacy.so.1 \
libvtkIOXML.so.1 \
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
