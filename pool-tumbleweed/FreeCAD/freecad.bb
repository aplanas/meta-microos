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
FreeCAD(aarch-64) \
application() \
application(org.freecadweb.FreeCAD.desktop) \
freecad \
libDriver.so()(64bit) \
libDriverDAT.so()(64bit) \
libDriverSTL.so()(64bit) \
libDriverUNV.so()(64bit) \
libE57Format.so()(64bit) \
libFreeCADApp.so()(64bit) \
libFreeCADBase.so()(64bit) \
libFreeCADGui.so()(64bit) \
libMEFISTO2.so()(64bit) \
libNETGENPlugin.so()(64bit) \
libSMDS.so()(64bit) \
libSMESH.so()(64bit) \
libSMESHDS.so()(64bit) \
libStdMeshers.so()(64bit) \
libarea-native.so()(64bit) \
metainfo() \
metainfo(org.freecadweb.FreeCAD.appdata.xml) \
mimehandler(application/x-extension-fcstd)"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libCoin.so.80()(64bit) \
libGL.so.1()(64bit) \
libGLU.so.1()(64bit) \
libQt5Concurrent.so.5()(64bit) \
libQt5Concurrent.so.5(Qt_5)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5OpenGL.so.5()(64bit) \
libQt5OpenGL.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5WebEngineCore.so.5()(64bit) \
libQt5WebEngineCore.so.5(Qt_5)(64bit) \
libQt5WebEngineWidgets.so.5()(64bit) \
libQt5WebEngineWidgets.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libQt5XmlPatterns.so.5()(64bit) \
libQt5XmlPatterns.so.5(Qt_5)(64bit) \
libTKBO.so.7.6()(64bit) \
libTKBRep.so.7.6()(64bit) \
libTKBool.so.7.6()(64bit) \
libTKCAF.so.7.6()(64bit) \
libTKCDF.so.7.6()(64bit) \
libTKFeat.so.7.6()(64bit) \
libTKFillet.so.7.6()(64bit) \
libTKG2d.so.7.6()(64bit) \
libTKG3d.so.7.6()(64bit) \
libTKGeomAlgo.so.7.6()(64bit) \
libTKGeomBase.so.7.6()(64bit) \
libTKHLR.so.7.6()(64bit) \
libTKIGES.so.7.6()(64bit) \
libTKLCAF.so.7.6()(64bit) \
libTKMath.so.7.6()(64bit) \
libTKMesh.so.7.6()(64bit) \
libTKMeshVS.so.7.6()(64bit) \
libTKOffset.so.7.6()(64bit) \
libTKPrim.so.7.6()(64bit) \
libTKRWMesh.so.7.6()(64bit) \
libTKSTEP.so.7.6()(64bit) \
libTKSTEP209.so.7.6()(64bit) \
libTKSTEPAttr.so.7.6()(64bit) \
libTKSTEPBase.so.7.6()(64bit) \
libTKSTL.so.7.6()(64bit) \
libTKShHealing.so.7.6()(64bit) \
libTKTopAlgo.so.7.6()(64bit) \
libTKXCAF.so.7.6()(64bit) \
libTKXDEIGES.so.7.6()(64bit) \
libTKXDESTEP.so.7.6()(64bit) \
libTKXSBase.so.7.6()(64bit) \
libTKernel.so.7.6()(64bit) \
libboost_filesystem.so.1.80.0()(64bit) \
libboost_program_options.so.1.80.0()(64bit) \
libboost_thread.so.1.80.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfreetype.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgomp.so.1()(64bit) \
libgomp.so.1(GOMP_1.0)(64bit) \
libgomp.so.1(GOMP_4.0)(64bit) \
libgomp.so.1(GOMP_4.5)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmedC.so.11()(64bit) \
libngcore.so()(64bit) \
libnglib.so()(64bit) \
libpyside2.cpython-310-aarch64-linux-gnu.so.5.15()(64bit) \
libpython3.10.so.1.0()(64bit) \
libshiboken2.cpython-310-aarch64-linux-gnu.so.5.15()(64bit) \
libspnav.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.1)(64bit) \
libstdc++.so.6(CXXABI_1.3.11)(64bit) \
libstdc++.so.6(CXXABI_1.3.13)(64bit) \
libstdc++.so.6(CXXABI_1.3.2)(64bit) \
libstdc++.so.6(CXXABI_1.3.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.7)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.17)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.5)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libvtkCommonCore.so.1()(64bit) \
libvtkCommonDataModel.so.1()(64bit) \
libvtkCommonExecutionModel.so.1()(64bit) \
libvtkFiltersCore.so.1()(64bit) \
libvtkFiltersExtraction.so.1()(64bit) \
libvtkFiltersGeneral.so.1()(64bit) \
libvtkFiltersGeometry.so.1()(64bit) \
libvtkFiltersSources.so.1()(64bit) \
libvtkFiltersVerdict.so.1()(64bit) \
libvtkIOCore.so.1()(64bit) \
libvtkIOLegacy.so.1()(64bit) \
libvtkIOXML.so.1()(64bit) \
libxerces-c-3.2.so()(64bit) \
libz.so.1()(64bit) \
python3-PyYAML \
python3-matplotlib-qt5 \
python3-numpy \
python3-pivy \
python3-ply \
python3-pyside2 \
python3-six \
python3-vtk"

inherit rpm
