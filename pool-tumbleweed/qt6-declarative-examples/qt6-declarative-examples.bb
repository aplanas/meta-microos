SUMMARY = "Examples for the qt6-declarative module"
DESCRIPTION = "Examples for the qt6-declarative module."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-declarative-examples-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "5b827d0a62682e02860c41f6310d0887b86d3ccf729a7638a7195b7614c6e659eb836332688763b25b39e20fb36975d9ca8168d2fc741aea33df0a8123cb678f"

RPROVIDES:${PN} += "libMyStyle.so \
libaffectors-shared.so \
libanimation-shared.so \
libcanvas-shared.so \
libchartsplugin.so \
libdelegatechooser-shared.so \
libdraganddrop-shared.so \
libemitters-shared.so \
libimageelements-shared.so \
libimageparticle-shared.so \
libitemparticle-shared.so \
libitemswitcher-shared.so \
libpositioners-shared.so \
libqmlimageproviderplugin.so \
libqmlimageresponseproviderplugin.so \
libqmltextballoon.so \
librighttoleft-shared.so \
libshapes-shared.so \
libsystem-shared.so \
libtestbed-shared.so \
libtext-shared.so \
libthreading-shared.so \
libtouchinteraction-shared.so \
libviews-shared.so \
libwearable.so \
libwearablesettings.so \
libwearablestyle.so \
libwindow-shared.so \
qt6-declarative-examples \
qt6-quickcontrols2-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6OpenGL.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickControls2.so.6 \
libQt6QuickTest.so.6 \
libQt6QuickWidgets.so.6 \
libQt6Sql.so.6 \
libQt6Test.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
