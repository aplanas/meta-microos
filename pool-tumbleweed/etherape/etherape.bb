SUMMARY = "A Graphical Network Monitor"
DESCRIPTION = "EtherApe is a graphical network monitor for Unix, modeled after \
etherman. Featuring link layer, IP, and TCP modes, it displays network \
activity graphically. Hosts and links change in size with traffic. \
Various protocols are color coded in the display. It supports ethernet, \
FDDI, token ring, ISDN, PPP, and SLIP devices. It can filter traffic to \
show and can read traffic from a file as well as live from the network."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.20"

RPM_NAME = "etherape-0.9.20-3.4.aarch64.rpm"
RPM_HASH = "7556885c3a5f73ca8bbfc9a5449e5d660aaa7c4c22d93ae9bbd29ba1bce652ce0496db92312c843694890699f98ee6ba67ab544b62296786029e9d4bdd7ef8fc"

RPROVIDES:${PN} += "etherape"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgoocanvas-2.0.so.9 \
libgtk-3.so.0 \
libm.so.6 \
libpcap.so.1 \
libpopt.so.0 \
update-desktop-files \
xdg-utils"

inherit rpm
