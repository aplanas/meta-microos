SUMMARY = "Widgets Library for the Xfce Desktop Environment"
DESCRIPTION = "The libxfce4ui library provides a number of widgets commonly used by Xfce \
applications. This package provides the GTK 3 variant of libxfce4ui."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.4"

RPM_NAME = "libxfce4ui-2-0-4.18.4-1.1.aarch64.rpm"
RPM_HASH = "81ea9d8954898226f110e009b5fcb527429b0f79ae821ec76b2d4422dcffdc4ad7b6e00a40e4d738aca5e8e02a67de17fd07b5db2c3962f9bed4d5900443d49b"

RPROVIDES:${PN} += "libxfce4ui-2-0 \
libxfce4ui-2-0(aarch-64) \
libxfce4ui-2.so.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
exo-tools \
ld-linux-aarch64.so.1()(64bit) \
libICE.so.6()(64bit) \
libSM.so.6()(64bit) \
libX11.so.6()(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libstartup-notification-1.so.0()(64bit) \
libxfce4util.so.7()(64bit) \
libxfconf-0.so.3()(64bit)"

inherit rpm
