SUMMARY = "Data extractor for data points from graphical plots"
DESCRIPTION = "xyscan is a tool for scientists in need of extracting data points, \
i.e. numeric values, from a plot."
LICENSE = "GPL-3.0-or-later"

PV = "4.64"

RPM_NAME = "xyscan-4.64-1.6.aarch64.rpm"
RPM_HASH = "b2ae32006321aeecf876d6ca2ee0b97901eb60baa20c8a36e46893bc0acf1beadd7312e2107c517f77836391a78281b30a55721cda19f8b022d92be226881934"

RPROVIDES:${PN} += "application() \
application(xyscan.desktop) \
xyscan \
xyscan(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
hicolor-icon-theme \
ld-linux-aarch64.so.1()(64bit) \
libQt6Charts.so.6()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Multimedia.so.6()(64bit) \
libQt6Network.so.6()(64bit) \
libQt6Network.so.6(Qt_6)(64bit) \
libQt6PrintSupport.so.6()(64bit) \
libQt6PrintSupport.so.6(Qt_6)(64bit) \
libQt6Widgets.so.6()(64bit) \
libQt6Widgets.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libpoppler-qt6.so.3()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
