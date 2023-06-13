SUMMARY = "Qt-GUI for CSXCAD library"
DESCRIPTION = "A Qt-GUI for the CSXCAD library."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6.2"

RPM_NAME = "libQCSXCAD0-0.6.2-5.5.aarch64.rpm"
RPM_HASH = "3c76c133ff510e4ca061a3bcc41df63d002360f4ca2789f32f5ffff3db247bebc61e3fb86b0a9fb6bd635d4d052e2d724e0c457e35c97b251a5c3a8f263339ab"

RPROVIDES:${PN} += "libQCSXCAD.so.0()(64bit) \
libQCSXCAD0 \
libQCSXCAD0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libCSXCAD.so.0()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libtinyxml.so.0()(64bit) \
libvtkCommonCore.so.1()(64bit) \
libvtkCommonDataModel.so.1()(64bit) \
libvtkCommonExecutionModel.so.1()(64bit) \
libvtkCommonTransforms.so.1()(64bit) \
libvtkFiltersCore.so.1()(64bit) \
libvtkFiltersGeneral.so.1()(64bit) \
libvtkFiltersGeometry.so.1()(64bit) \
libvtkFiltersModeling.so.1()(64bit) \
libvtkFiltersSources.so.1()(64bit) \
libvtkGUISupportQt.so.1()(64bit) \
libvtkIOGeometry.so.1()(64bit) \
libvtkIOImage.so.1()(64bit) \
libvtkIOPLY.so.1()(64bit) \
libvtkIOXML.so.1()(64bit) \
libvtkInteractionStyle.so.1()(64bit) \
libvtkInteractionWidgets.so.1()(64bit) \
libvtkRenderingAnnotation.so.1()(64bit) \
libvtkRenderingCore.so.1()(64bit) \
libvtkRenderingFreeType.so.1()(64bit) \
libvtkRenderingLOD.so.1()(64bit) \
libvtkRenderingOpenGL2.so.1()(64bit) \
libvtksys.so.1()(64bit)"

inherit rpm
