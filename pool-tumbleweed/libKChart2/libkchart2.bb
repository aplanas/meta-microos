SUMMARY = "KChart library for kdiagram"
DESCRIPTION = "This package contains the KChart libraries from the kdiagram package."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "libKChart2-2.8.0-1.15.aarch64.rpm"
RPM_HASH = "6e940e6553201a6893a88560589754e1e34dc0b99a7875327b808d1180fd355477237a8a913b73ef80ce785448fab49f0935d09b1b889cf3d3436cbdbdf15475"

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
