SUMMARY = "Examples for the qt6-declarative module"
DESCRIPTION = "Examples for the qt6-declarative module."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-declarative-examples-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "7e836da0939ef2210084f5bd26eb97cf7ffe0e21c396de892e8948ff0bd033d1db4e62b7c41c0adf5ff5dd478b2ce743b61f9afe0c50e1ff1618b72fa24ebc0b"

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
libqmlqtimeexample.so \
libqmltextballoon.so \
librighttoleft-shared.so \
libshapes-shared.so \
libsystem-shared.so \
libtestbed-shared.so \
libtext-shared.so \
libthreading-shared.so \
libtouchinteraction-shared.so \
libviews-shared.so \
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
