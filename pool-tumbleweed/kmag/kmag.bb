SUMMARY = "Screen Magnifier"
DESCRIPTION = "Magnifies a part of the screen."
LICENSE = "GPL-2.0-only"

PV = "23.08.0"

RPM_NAME = "kmag-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "e2fdf77dd0406bf80593c1b087f0f87fe09e77fc0d6ab123701d6f25e3e52a8f040ad0aa2494cc89c660b96bf3bfbff04a9e6ac4634ed7723fe03a91dfaddc29"

RPROVIDES:${PN} += "kmag \
kmag5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
