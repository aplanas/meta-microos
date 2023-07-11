SUMMARY = "Visualization tools for the Performance Co-Pilot toolkit"
DESCRIPTION = "Visualization tools for the Performance Co-Pilot toolkit. \
The pcp-gui package primarily includes visualization tools for \
monitoring systems using live and archived Performance Co-Pilot \
(PCP) sources."
LICENSE = "GPL-2.0+ & LGPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-gui-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "8030dc3e5e0b5e44a4bf30f15f09e50d4767230273953290ee848cf38983ee8d20e5e076cd11c23fca397c0b18e5dec335ff7e7ecc01013388ef81afa63f9c5a"

RPROVIDES:${PN} += "config-pcp-gui \
pcp-gui"

RDEPENDS:${PN} += "/usr/bin/sh \
dejavu-fonts \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpcp.so.3 \
libstdc++.so.6"

inherit rpm
