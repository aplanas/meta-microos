SUMMARY = "Development files for QCustomPlot"
DESCRIPTION = "This package contains libraries and header files for \
developing applications that use QCustomPlot."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.1"

RPM_NAME = "qcustomplot-devel-2.1.1-2.3.aarch64.rpm"
RPM_HASH = "28fc541d6d90be94fe0a1762a102824eaa96662da217fd5851fdefb331676a88ca132c194fd7f9fbdc27f3b3c41a8926397a278da2fb83a1156b77af84aa8d29"

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
