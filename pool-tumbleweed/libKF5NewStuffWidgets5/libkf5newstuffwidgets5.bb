SUMMARY = "Framework for downloading and sharing additional application data"
DESCRIPTION = "The KNewStuff library implements collaborative data sharing for \
applications. It uses libattica to support the Open Collaboration Services \
specification."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5NewStuffWidgets5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "0e78b7a02049b2742ebdc020bdfce8718db3f80521ad309f4c82a2be6beedbe1d620ccc7044354e94a664d6e94bc8ade08afbfa51ee7287afde0a11cdf56bef7"

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
