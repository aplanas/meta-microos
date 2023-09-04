SUMMARY = "Framework for downloading and sharing additional application data"
DESCRIPTION = "The KNewStuff library implements collaborative data sharing for \
applications. It uses libattica to support the Open Collaboration Services \
specification."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5NewStuffWidgets5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "a3f0f1df4c7ffdaa6ea50fa02e263aa6d517be426c9b36bd8750dabef21c05c46797602d90707523e4e96b9c5640479808602d8af91ec66cff5fe681da61341b"

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
