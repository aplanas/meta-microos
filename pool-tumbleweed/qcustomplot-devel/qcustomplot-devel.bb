SUMMARY = "Development files for QCustomPlot"
DESCRIPTION = "This package contains libraries and header files for \
developing applications that use QCustomPlot."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.1"

RPM_NAME = "qcustomplot-devel-2.1.1-2.4.aarch64.rpm"
RPM_HASH = "a6cc7b040eb3ad1242728016cbea8242d41df576ff2412c6ae02fc36580027c65adc903fe9f941935fedc74e37a1a5e6590c2fff7096c5f8d3b025a2db529bb5"

RPROVIDES:${PN} += "libqcustomplot.so.2 \
pkgconfig-qcustomplot \
qcustomplot-devel \
qcustomplot-qt5-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libqcustomplot2 \
libstdc++.so.6 \
pkgconfig-Qt5PrintSupport"

inherit rpm
