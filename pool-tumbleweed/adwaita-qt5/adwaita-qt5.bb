SUMMARY = "Adwaita Qt5 theme"
DESCRIPTION = " \
Adwaita theme variant for applications utilizing Qt5"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.4.2"

RPM_NAME = "adwaita-qt5-1.4.2-3.3.aarch64.rpm"
RPM_HASH = "9864354d154208502b72a449e7c1c94259579264cef0c181152ccf45b9c37266ef840126c2cdb2d27d0254d31610735bd2ce524fb94c600d60798f396def7f6e"

RPROVIDES:${PN} += "adwaita-qt5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libadwaitaqt.so.1 \
libadwaitaqt5-1 \
libadwaitaqtpriv.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libxcb.so.1"

inherit rpm
