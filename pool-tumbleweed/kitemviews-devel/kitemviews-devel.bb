SUMMARY = "Set of item views extending the Qt model-view framework"
DESCRIPTION = "KItemViews includes a set of views, which can be used with item models. It \
includes views for categorizing lists and to add search filters to flat and \
hierarchical lists. Development files."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "5.106.0"

RPM_NAME = "kitemviews-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "775cca4ef2e6c3f66adf1c565a5637d67fe15f9c51dfe60794ceb89e27016dfc38cc3cc93940c6c463e157e89c4869c716a8e164a9410854d15784925021a7c8"

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
