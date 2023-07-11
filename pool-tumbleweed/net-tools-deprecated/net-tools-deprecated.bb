SUMMARY = "Deprecated Networking Utilities"
DESCRIPTION = "This package contains the deprecated network utilities arp, ifconfig, netstat and route, \
which have been replaced by tools from the iproute2 package: \
  * arp -> ip [-r] neigh \
  * ifconfig -> ip a \
  * netstat -> ss [-r] \
  * route -> ip r"
LICENSE = "GPL-2.0-or-later"

PV = "2.10"

RPM_NAME = "net-tools-deprecated-2.10-2.2.aarch64.rpm"
RPM_HASH = "32ce097bcfa4767734ce3c86662d9288c90362f1a3776f0e7e5adf2d9e5f7a469a06511abb2668724b3d7375561b51a24eca35ff494a089097087d56067509fb"

RPROVIDES:${PN} += "net-tools-deprecated"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
