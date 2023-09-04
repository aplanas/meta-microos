SUMMARY = "Set of item views extending the Qt model-view framework"
DESCRIPTION = "KItemViews includes a set of views, which can be used with item models. It \
includes views for categorizing lists and to add search filters to flat and \
hierarchical lists."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5ItemViews5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "17dc018ace26d80f3505cec068fd989fa48b439b878a4b303e3956356ee37443e03f21a5734732e69d6590787f99bf74b4ae298cd1c7e994be73c48100c2ec0a"

RPROVIDES:${PN} += "libKF5ItemViews.so.5 \
libKF5ItemViews5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Widgets5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
