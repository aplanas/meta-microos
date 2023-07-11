SUMMARY = "Qt libraries for VTK"
DESCRIPTION = "VTK is a software system for image processing, 3D graphics, volume \
rendering and visualization. VTK includes many advanced algorithms \
(e.g. surface reconstruction, implicit modelling, decimation) and \
rendering techniques (e.g. hardware-accelerated volume rendering, \
LOD control). \
 \
This package provides the Qt libraries for VTK."
LICENSE = "BSD-3-Clause"

PV = "9.2.6"

RPM_NAME = "vtk-openmpi4-qt-9.2.6-2.5.aarch64.rpm"
RPM_HASH = "a1ed49a6b39422589034ac6bc3f6d482aa6998496f7a908f56254cb2b031386d101d4dd3f0a946a6b6492f1812b95c54e8e31502a2dc2f6281d4bd244fab627f"

RPROVIDES:${PN} += "libqmlvtkplugin.so \
libvtkGUISupportQt.so.1 \
libvtkGUISupportQtQuick.so.1 \
libvtkGUISupportQtSQL.so.1 \
libvtkRenderingQt.so.1 \
libvtkViewsQt.so.1 \
vtk-openmpi4-qt"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGLESv2.so.2 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libvtk1-openmpi4 \
libvtkCommonCore.so.1 \
libvtkCommonDataModel.so.1 \
libvtkCommonExecutionModel.so.1 \
libvtkCommonSystem.so.1 \
libvtkFiltersExtraction.so.1 \
libvtkFiltersSources.so.1 \
libvtkFiltersTexture.so.1 \
libvtkIOSQL.so.1 \
libvtkInfovisCore.so.1 \
libvtkInteractionStyle.so.1 \
libvtkInteractionWidgets.so.1 \
libvtkRenderingCore.so.1 \
libvtkRenderingLabel.so.1 \
libvtkRenderingOpenGL2.so.1 \
libvtkViewsCore.so.1 \
libvtkViewsInfovis.so.1 \
libvtksys.so.1"

inherit rpm
