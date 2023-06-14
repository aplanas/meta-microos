SUMMARY = "KChart library for kdiagram"
DESCRIPTION = "This package contains the KChart libraries from the kdiagram package."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "libKChart2-2.8.0-1.14.aarch64.rpm"
RPM_HASH = "d541c2c2761f40ea5d85d49c77ac464a796325927b13aea2f86c21dbccedd683c146dcc6e743aaeb0f1cf20bb0a576a24f798a64e366404ef23802c5490d89de"

RPROVIDES:${PN} += "libKChart.so.2 \
libKChart2 \
libkchart"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
