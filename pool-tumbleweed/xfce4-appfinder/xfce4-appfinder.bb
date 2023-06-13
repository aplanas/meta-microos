SUMMARY = "Application Finder for the Xfce Desktop Environment"
DESCRIPTION = "xfce4-appfinder is an application finder for the Xfce desktop environment. It \
is a useful program that allows you to find applications on the system and \
launch them. It provides easy keyboard navigation and can be used as a \
replacement for xfrun4."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.0"

RPM_NAME = "xfce4-appfinder-4.18.0-1.3.aarch64.rpm"
RPM_HASH = "786a4dc936d40232a60eb27f469f9c6fde81e73ef9a35df7b80fc51e03cce488c884db9f27038f672e418a698f3b5226466fff8051768a94b384736e730acc59"

RPROVIDES:${PN} += "application() \
application(xfce4-appfinder.desktop) \
application(xfce4-run.desktop) \
metainfo() \
metainfo(org.xfce.xfce4-appfinder.appdata.xml) \
xfce4-appfinder \
xfce4-appfinder(aarch-64)"

RDEPENDS:${PN} += "exo-tools \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo-gobject.so.2()(64bit) \
libcairo.so.2()(64bit) \
libgarcon-1.so.0()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libxfce4ui-2.so.0()(64bit) \
libxfce4util.so.7()(64bit) \
libxfconf-0.so.3()(64bit)"

inherit rpm
