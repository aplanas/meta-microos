SUMMARY = "Data extractor for data points from graphical plots"
DESCRIPTION = "xyscan is a tool for scientists in need of extracting data points, \
i.e. numeric values, from a plot."
LICENSE = "GPL-3.0-or-later"

PV = "4.64"

RPM_NAME = "xyscan-4.64-1.6.aarch64.rpm"
RPM_HASH = "b2ae32006321aeecf876d6ca2ee0b97901eb60baa20c8a36e46893bc0acf1beadd7312e2107c517f77836391a78281b30a55721cda19f8b022d92be226881934"

RPROVIDES:${PN} += "xyscan"

RDEPENDS:${PN} += "/bin/sh \
hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libQt6Charts.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6Network.so.6 \
libQt6PrintSupport.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpoppler-qt6.so.3 \
libstdc++.so.6"

inherit rpm
