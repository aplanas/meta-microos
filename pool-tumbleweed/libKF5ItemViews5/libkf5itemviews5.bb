SUMMARY = "Set of item views extending the Qt model-view framework"
DESCRIPTION = "KItemViews includes a set of views, which can be used with item models. It \
includes views for categorizing lists and to add search filters to flat and \
hierarchical lists."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5ItemViews5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "deb74f342af913938178e86e58e96491f3792a8e248cbeec04c9409e29dc07ec036776e718cb61f54cbddf6adf4596fa89cdab9ddbd76159735216cbbea9c988"

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
