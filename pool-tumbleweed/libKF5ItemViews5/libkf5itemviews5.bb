SUMMARY = "Set of item views extending the Qt model-view framework"
DESCRIPTION = "KItemViews includes a set of views, which can be used with item models. It \
includes views for categorizing lists and to add search filters to flat and \
hierarchical lists."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5ItemViews5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "00cf1f2451e641da8b79ba20c487afe70689ace8533bf139aac00a9f3b40f2423d8b70cfc2765c4136b3d32ec7ea897fb6b48ef077035ef643b6ac6a68c88aac"

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
