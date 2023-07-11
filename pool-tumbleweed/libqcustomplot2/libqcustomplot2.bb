SUMMARY = "Qt widget for plotting and data visualization"
DESCRIPTION = "QCustomPlot is a Qt C++ widget for plotting and data visualization. \
This plotting library focuses on making good looking, publication quality 2D \
plots, graphs and charts, as well as offering high performance for realtime \
visualization applications."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.1"

RPM_NAME = "libqcustomplot2-2.1.1-2.4.aarch64.rpm"
RPM_HASH = "f2864647866dc60cc1ca85dc2adf0a2458d9c61a1abbd26adc42c7fad3086e0002ba866b30115cff5f9a7fe65f9252f2ae11a1b54822d517c66e4b49731bbd09"

RPROVIDES:${PN} += "libqcustomplot \
libqcustomplot-2 \
libqcustomplot.so.2 \
libqcustomplot2 \
qcustomplot \
qcustomplot-qt5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
