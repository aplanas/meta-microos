SUMMARY = "Shared plugins and libraries"
DESCRIPTION = "This package ships libraries and plugins built with a different Qt version. \
There are required in order to inspect executables built with different \
Qt versions."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.0"

RPM_NAME = "gammaray-qt6-shared-plugins-3.0.0-1.1.aarch64.rpm"
RPM_HASH = "36789ad55d8d080af8a84b810ac18d78edd0142719035551c344a044fd87698570ba137ffed017e668d9e89e7db6ad0c50182eb7d369e7629b535415ec8f4452"

RPROVIDES:${PN} += "gammaray-qt6-shared-plugins \
libgammaray-geopositioninfosource.so \
libgammaray-widget-export-actions.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt63DAnimation.so.6 \
libQt63DCore.so.6 \
libQt63DExtras.so.6 \
libQt63DInput.so.6 \
libQt63DLogic.so.6 \
libQt63DRender.so.6 \
libQt6Bluetooth.so.6 \
libQt6Core.so.6 \
libQt6Designer.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6OpenGL.so.6 \
libQt6Positioning.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickWidgets.so.6 \
libQt6Svg.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgammaray-common-qt6-5-aarch64.so.3.0.0 \
libgammaray-core-qt6-5-aarch64.so.3.0.0 \
libgammaray-kitemmodels-qt6-5-aarch64.so.3.0.0 \
libgammaray-kuserfeedback.so.3.0.0 \
libgammaray-ui-qt6-5-aarch64.so.3.0.0 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
