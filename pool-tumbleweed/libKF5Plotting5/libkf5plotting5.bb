SUMMARY = "KDE Data plotting library"
DESCRIPTION = "KPlotWidget is a QWidget-derived class that provides a virtual base \
class for data plotting. The idea behind KPlotWidget is that a \
developer only has to specify information in 'data units', i.e. the \
natural units of the data being plotted. KPlotWidget automatically \
converts everything to screen pixel units."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5Plotting5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "63ed7843bf80cca17d043a665c710d8cb847e06e15a6acbbcacb3f8c34e7ce7e97447dfbf7a6286ea8ad377fc933d25916ad03e82f7f8f9fd31516c7599e4729"

RPROVIDES:${PN} += "libKF5Plotting.so.5 \
libKF5Plotting5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Widgets5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
