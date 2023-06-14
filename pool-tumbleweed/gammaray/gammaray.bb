SUMMARY = "Introspection/Debugging Tool for Qt Applications"
DESCRIPTION = "Gamma Ray is a comprehensive collection of high level introspection \
and debugging utilities specifically tailored for the various \
frameworks in Qt."
LICENSE = "GPL-2.0-or-later"

PV = "2.11.3"

RPM_NAME = "gammaray-2.11.3-2.15.aarch64.rpm"
RPM_HASH = "3dd4866bc7213a382317de446cfd8811e8890f3bbf911d1dd1015b0c4a30973c58eef90f0baf5f6052971e7899b1872e2380463ed4d3ed257b53b925f30b02a7"

RPROVIDES:${PN} += "gammaray \
libgammaray-client.so.2.11.3 \
libgammaray-common-qt5-15-aarch64.so.2.11.3 \
libgammaray-core-qt5-15-aarch64.so.2.11.3 \
libgammaray-geopositioninfosource.so \
libgammaray-kitemmodels-qt5-15-aarch64.so.2.11.3 \
libgammaray-kuserfeedback.so.2.11.3 \
libgammaray-launcher-ui.so.2.11.3 \
libgammaray-launcher.so.2.11.3 \
libgammaray-ui-qt5-15-aarch64.so.2.11.3 \
libgammaray-widget-export-actions.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5SyntaxHighlighting.so.5 \
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
libQt5PrintSupport.so.5 \
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
libdw.so.1 \
libgcc-s.so.1 \
libkdstatemachineeditor-core.so.1 \
libkdstatemachineeditor-view.so.1 \
libm.so.6 \
libstdc++.so.6 \
libwayland-server.so.0"

inherit rpm
