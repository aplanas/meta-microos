SUMMARY = "Set of item views extending the Qt model-view framework"
DESCRIPTION = "KItemViews includes a set of views, which can be used with item models. It \
includes views for categorizing lists and to add search filters to flat and \
hierarchical lists. Development files."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "5.107.0"

RPM_NAME = "kitemviews-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "e5c858c7ab8286fda7d29fcf2be38184da52e81fe64b3738c642551a1e0205e6900008cdfed9baf6565e5b49ae6cc738af71ca62244c5c031f34b1e941680f79"

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
