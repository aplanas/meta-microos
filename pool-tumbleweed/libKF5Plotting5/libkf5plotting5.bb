SUMMARY = "KDE Data plotting library"
DESCRIPTION = "KPlotWidget is a QWidget-derived class that provides a virtual base \
class for data plotting. The idea behind KPlotWidget is that a \
developer only has to specify information in 'data units', i.e. the \
natural units of the data being plotted. KPlotWidget automatically \
converts everything to screen pixel units."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5Plotting5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "594e37054f12b1bc1a4ecd5da2d02ed3c4b355de0694d4b5b8480992e5723f1a1d8d80f40d6249d56fea26cc5b564f6dc77a363b4e5a849e000414d73161cd40"

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
