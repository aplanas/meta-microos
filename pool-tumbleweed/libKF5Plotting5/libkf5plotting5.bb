SUMMARY = "KDE Data plotting library"
DESCRIPTION = "KPlotWidget is a QWidget-derived class that provides a virtual base \
class for data plotting. The idea behind KPlotWidget is that a \
developer only has to specify information in 'data units', i.e. the \
natural units of the data being plotted. KPlotWidget automatically \
converts everything to screen pixel units."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5Plotting5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "eec312c9d88b5bffdb0981660458baf60aef11c21584782f9728d66c5c28c1acc070b61210a0c432a5f222e3d24fb944257fcfa4b15019fb7c220e0f5cc99c84"

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
