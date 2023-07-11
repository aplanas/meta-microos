SUMMARY = "Framework for downloading and sharing additional application data"
DESCRIPTION = "The KNewStuff library implements collaborative data sharing for \
applications. It uses libattica to support the Open Collaboration Services \
specification."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5NewStuffWidgets5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "b9c2d89b33bc142ed639b8dc7066f1c5eb98add9107ad2fdbffd1be25c8fe1f3ef182751e1fbca4a42668186b2cf740ef14f5daa2489a854d2b051128d406b11"

RPROVIDES:${PN} += "libKF5NewStuffWidgets.so.5 \
libKF5NewStuffWidgets5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5I18n.so.5 \
libKF5NewStuff.so.5 \
libKF5NewStuffCore.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
