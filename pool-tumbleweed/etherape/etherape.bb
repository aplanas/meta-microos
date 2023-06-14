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
