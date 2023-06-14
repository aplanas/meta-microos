SUMMARY = "Application Finder for the Xfce Desktop Environment"
DESCRIPTION = "xfce4-appfinder is an application finder for the Xfce desktop environment. It \
is a useful program that allows you to find applications on the system and \
launch them. It provides easy keyboard navigation and can be used as a \
replacement for xfrun4."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.0"

RPM_NAME = "xfce4-appfinder-4.18.0-1.3.aarch64.rpm"
RPM_HASH = "786a4dc936d40232a60eb27f469f9c6fde81e73ef9a35df7b80fc51e03cce488c884db9f27038f672e418a698f3b5226466fff8051768a94b384736e730acc59"

RPROVIDES:${PN} += "xfce4-appfinder"

RDEPENDS:${PN} += "exo-tools \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libgarcon-1.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
libxfconf-0.so.3"

inherit rpm
