SUMMARY = "Text autocorrection library"
DESCRIPTION = "This package provides a library for text autocorrection."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.0"

RPM_NAME = "libKF5TextAutoCorrection1-1.1.0-1.1.aarch64.rpm"
RPM_HASH = "690147da1dc413a1ec88157cf3bfddeaea829418e3dfbf83056c680f52356d215107bffc3ec5e9221a188ecab118fc4e41f988ab472e16eef9658b766a89dcc2"

RPROVIDES:${PN} += "libKF5TextAutoCorrection.so.1 \
libKF5TextAutoCorrection1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ktextaddons \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5I18n.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
