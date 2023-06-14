SUMMARY = "Examples for the qt6-declarative module"
DESCRIPTION = "Examples for the qt6-declarative module."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-declarative-examples-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "e0da7e1abe4dc91ff452028b67a87f68219373ce2843e2c0dc853ca822bb70ce5216ae22649e535081cfded405d025c7ce47a6da7ba95788f0b5ea73ece6db69"

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
