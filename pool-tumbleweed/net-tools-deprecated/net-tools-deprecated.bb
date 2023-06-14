SUMMARY = "Deprecated Networking Utilities"
DESCRIPTION = "This package contains the deprecated network utilities arp, ifconfig, netstat and route, \
which have been replaced by tools from the iproute2 package: \
  * arp -> ip [-r] neigh \
  * ifconfig -> ip a \
  * netstat -> ss [-r] \
  * route -> ip r"
LICENSE = "GPL-2.0-or-later"

PV = "2.10"

RPM_NAME = "net-tools-deprecated-2.10-2.1.aarch64.rpm"
RPM_HASH = "303bfecd4156b7ca2030d7c135fbf98316cb0fbf2f0cce80e2c9d440523eb7d2ddd3a0f625bd7e6c6246d53c9065eb9275ab86e2ed1b44837514873e791d993d"

RPROVIDES:${PN} += "net-tools-deprecated"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
