SUMMARY = "Libraries for dtkwidget"
DESCRIPTION = "The dtkwidget-devel package contains the header files and developer \
docs for dtkcore."
LICENSE = "LGPL-3.0-only"

PV = "5.5.52"

RPM_NAME = "libdtkwidget5-5.5.52-1.8.aarch64.rpm"
RPM_HASH = "3ee9904149abe81de344f0245a485954ea17f6bc77bdc21986bf499f9931c5ae95acec461aa5d58be3f23690baf6562b14e4043dbf081f6f87e4abf2fdf8154e"

RPROVIDES:${PN} += "libdtkwidget.so.5 \
libdtkwidget5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libXext.so.6 \
libXi.so.6 \
libc.so.6 \
libdtkcore.so.5 \
libdtkgui.so.5 \
libgcc-s.so.1 \
libgsettings-qt.so.1 \
libm.so.6 \
libstartup-notification-1.so.0 \
libstdc++.so.6 \
libxcb-util.so.1 \
libxcb.so.1"

inherit rpm
