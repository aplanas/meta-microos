SUMMARY = "KDE Data plotting library"
DESCRIPTION = "KPlotWidget is a QWidget-derived class that provides a virtual base \
class for data plotting. The idea behind KPlotWidget is that a \
developer only has to specify information in 'data units', i.e. the \
natural units of the data being plotted. KPlotWidget automatically \
converts everything to screen pixel units."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5Plotting5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "c481ba0de4ae2d0748446c672913ab976d22123bb9d76dc4ac0eeac3eca80084129f2126a2e0515758b04d0ad0657a66e7f1412f7ca1c0b051be3afc71150d22"

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
