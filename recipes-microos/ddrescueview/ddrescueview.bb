SUMMARY = "Graphical viewer for GNU ddrescue mapfiles"
DESCRIPTION = "This small tool allows the user to graphically examine ddrescue's map files in a user friendly GUI application. The Main window displays a block grid with each block's color representing the block types it contains. Many people know this type of view from defragmentation programs."
LICENSE = "GPL-3.0-only"

PV = "0.4.5"

RPM_NAME = "ddrescueview-0.4.5-1.7.aarch64.rpm"
RPM_HASH = "146a1a48d3ba5c9f65c3419fc3e78348f04d2724950bc614d1682a882defccbc666e11f511ea77684b7a55d21737d8fa2e7224cedf52197573f551646d979af3"

RPROVIDES:${PN} += "application() \
application(ddrescueview.desktop) \
ddrescueview \
ddrescueview(aarch-64)"
RDEPENDS:${PN} += "libQt5Pas.so.1()(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
