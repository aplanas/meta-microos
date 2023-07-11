SUMMARY = "A library for sharing Bible navigation"
DESCRIPTION = "BibleSync is a multicast protocol to support Bible software shared \
co- navigation. It uses LAN multicast in either a personal/small team \
mutual navigation motif or in a classroom environment where there are \
Speakers plus the Audience. It provides a complete yet minimal public \
interface to support mode setting, setup for packet reception, \
transmit on local navigation, and handling of incoming packets. \
 \
This library is not specific to any particular Bible software \
framework, completely agnostic as to structure of layers above \
BibleSync."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libbiblesync2_0-2.1.0-1.10.aarch64.rpm"
RPM_HASH = "f69e3b70c18276b36a3b13f27a0331dcc866b004e9550a044569f9b08ded1f86a67683ed2d7feb7e18a738c71f9aafcd54706620b51661112ee36e179c4baecd"

RPROVIDES:${PN} += "libbiblesync.so.2.0 \
libbiblesync2-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libuuid.so.1"

inherit rpm
