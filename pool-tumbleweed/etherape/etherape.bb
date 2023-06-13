SUMMARY = "A Graphical Network Monitor"
DESCRIPTION = "EtherApe is a graphical network monitor for Unix, modeled after \
etherman. Featuring link layer, IP, and TCP modes, it displays network \
activity graphically. Hosts and links change in size with traffic. \
Various protocols are color coded in the display. It supports ethernet, \
FDDI, token ring, ISDN, PPP, and SLIP devices. It can filter traffic to \
show and can read traffic from a file as well as live from the network."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.20"

RPM_NAME = "etherape-0.9.20-3.3.aarch64.rpm"
RPM_HASH = "2b18031160103e27096189f6c71eb25739298ac2c3e22c3e135b067807a093decc4eb5778ca720697b5d462e66037bf2431e14c92798cf0023355511668533b2"

RPROVIDES:${PN} += "application() \
application(etherape-su.desktop) \
application(etherape.desktop) \
etherape \
etherape(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgoocanvas-2.0.so.9()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libpcap.so.1()(64bit) \
libpopt.so.0()(64bit) \
libpopt.so.0(LIBPOPT_0)(64bit) \
update-desktop-files \
xdg-utils"

inherit rpm
