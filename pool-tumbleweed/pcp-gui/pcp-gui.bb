SUMMARY = "Visualization tools for the Performance Co-Pilot toolkit"
DESCRIPTION = "Visualization tools for the Performance Co-Pilot toolkit. \
The pcp-gui package primarily includes visualization tools for \
monitoring systems using live and archived Performance Co-Pilot \
(PCP) sources."
LICENSE = "GPL-2.0+ & LGPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-gui-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "ff9a28d814a86ddbf633ba0c925b0252b00b1ff3221e9551e31fc42847e48a514cc519be5612b1e1b1486197fa17c01962b2f6d91a2f607c140f7332bf589a09"

RPROVIDES:${PN} += "application() \
application(pmchart.desktop) \
config(pcp-gui) \
pcp-gui \
pcp-gui(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
dejavu-fonts \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libpcp.so.3()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
