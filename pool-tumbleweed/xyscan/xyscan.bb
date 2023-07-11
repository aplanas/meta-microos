SUMMARY = "Data extractor for data points from graphical plots"
DESCRIPTION = "xyscan is a tool for scientists in need of extracting data points, \
i.e. numeric values, from a plot."
LICENSE = "GPL-3.0-or-later"

PV = "4.64"

RPM_NAME = "xyscan-4.64-1.7.aarch64.rpm"
RPM_HASH = "dbfed6572bc1fcb71a903c17506a34825f6845c5d0b955419f07381a54c38e9ffc60f3947e2bff1c54e13eb4943be918d79b2f46c81d89e1a6003ed62b6dd2a5"

RPROVIDES:${PN} += "xyscan"

RDEPENDS:${PN} += "/usr/bin/sh \
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
