SUMMARY = "Set of item views extending the Qt model-view framework"
DESCRIPTION = "KItemViews includes a set of views, which can be used with item models. It \
includes views for categorizing lists and to add search filters to flat and \
hierarchical lists. Development files."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "5.108.0"

RPM_NAME = "kitemviews-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "75d9939d72d67a335874b5870b220fea20d5a7bbee11028f222e36ff9f35e731e20e59c144f0fc95de077f10e91b2baf6a16848e739364bfb81dab9599adebb4"

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
