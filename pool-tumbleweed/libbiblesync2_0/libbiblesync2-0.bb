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

RPM_NAME = "libbiblesync2_0-2.1.0-1.9.aarch64.rpm"
RPM_HASH = "21a6942d7ea2312f682bbccfd9bc79a69eee5cb48ebefa0ba3550450cec468c08a7019ecf483b99792c84854b82940fdd7505468cf21bf339881d9ffaebcbe3f"

RPROVIDES:${PN} += "libbiblesync.so.2.0 \
libbiblesync2-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libuuid.so.1"

inherit rpm
