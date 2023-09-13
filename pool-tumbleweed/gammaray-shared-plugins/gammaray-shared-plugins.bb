SUMMARY = "Shared plugins and libraries"
DESCRIPTION = "This package ships libraries and plugins built with a different Qt version. \
There are required in order to inspect executables built with different \
Qt versions."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.0"

RPM_NAME = "gammaray-shared-plugins-3.0.0-1.1.aarch64.rpm"
RPM_HASH = "1edb6fd22fbf2c6082899e13ee16183df18387ef24728afe2e36496c5a90b31e6d27884112c5db6b6feab2d3dbba13a91dd61bb6748b36f8f5692835e9d36612"

RPROVIDES:${PN} += "gammaray-shared-plugins \
libgammaray-geopositioninfosource.so \
libgammaray-widget-export-actions.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libQt53DAnimation.so.5 \
libQt53DCore.so.5 \
libQt53DExtras.so.5 \
libQt53DInput.so.5 \
libQt53DLogic.so.5 \
libQt53DRender.so.5 \
libQt5Bluetooth.so.5 \
libQt5Core.so.5 \
libQt5Designer.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Positioning.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickWidgets.so.5 \
libQt5Script.so.5 \
libQt5ScriptTools.so.5 \
libQt5Scxml.so.5 \
libQt5Svg.so.5 \
libQt5WaylandCompositor.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgammaray-common-qt5-15-aarch64.so.3.0.0 \
libgammaray-core-qt5-15-aarch64.so.3.0.0 \
libgammaray-kitemmodels-qt5-15-aarch64.so.3.0.0 \
libgammaray-kuserfeedback.so.3.0.0 \
libgammaray-ui-qt5-15-aarch64.so.3.0.0 \
libgcc-s.so.1 \
libkdstatemachineeditor-core.so.1 \
libkdstatemachineeditor-view.so.1 \
libm.so.6 \
libstdc++.so.6 \
libwayland-server.so.0"

inherit rpm
