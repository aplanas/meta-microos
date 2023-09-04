SUMMARY = "Set of item views extending the Qt model-view framework"
DESCRIPTION = "KItemViews includes a set of views, which can be used with item models. It \
includes views for categorizing lists and to add search filters to flat and \
hierarchical lists. Development files."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "5.109.0"

RPM_NAME = "kitemviews-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "68bddc2b1c1ada8c323d117987e0f5464425afce6819d19063e21e5efac00acdf1528d05bb1f9d4910230d5fd68f933b3af769a2795c9f51a80728687c083743"

RPROVIDES:${PN} += "cmake-KF5ItemViews \
kitemviews-devel"

RDEPENDS:${PN} += "cmake-Qt5Widgets \
extra-cmake-modules \
ld-linux-aarch64.so.1 \
libKF5ItemViews.so.5 \
libKF5ItemViews5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
