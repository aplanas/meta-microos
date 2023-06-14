SUMMARY = "Text translation library"
DESCRIPTION = "This package provides a library for automated text translation."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.0"

RPM_NAME = "libKF5TextTranslator1-1.1.0-1.1.aarch64.rpm"
RPM_HASH = "5ad0c91e2ce2a2dc79478bd55c8a6e10bb58c83f8c4ae4c8982100a0c57c870547070436bb85c4b3d1fc7627907e5866833a73a6c2564088a4e3f3b60a95e20f"

RPROVIDES:${PN} += "libKF5TextTranslator.so.1 \
libKF5TextTranslator1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ktextaddons \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5I18n.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
