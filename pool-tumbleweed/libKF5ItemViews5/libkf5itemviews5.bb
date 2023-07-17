SUMMARY = "Set of item views extending the Qt model-view framework"
DESCRIPTION = "KItemViews includes a set of views, which can be used with item models. It \
includes views for categorizing lists and to add search filters to flat and \
hierarchical lists."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5ItemViews5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "f6ffbadd55f15d7e9d35855083018fb6da62029fba878451505fde5645d1bf128406e2a279a180f3749ff58d2a09f2cd3bf310d6d9b315650cf26476237b62ef"

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
