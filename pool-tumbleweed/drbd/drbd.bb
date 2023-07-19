SUMMARY = "Linux driver for the 'Distributed Replicated Block Device'"
DESCRIPTION = "DRBD is a distributed replicated block device. It mirrors a block \
device over the network to another machine. Think of it as networked \
raid 1. It is a building block for setting up clusters."
LICENSE = "GPL-2.0-or-later"

PV = "9.0.30~1+git.8e9c0812"

RPM_NAME = "drbd-9.0.30~1+git.8e9c0812-8.18.aarch64.rpm"
RPM_HASH = "a6df7062bd35a5ce78c5fca97146a21d955bc80e21f11e84dc36684bc163073ae68a7524883e9f45bcceab686e824f3e8d35a2ea28c8d9d3602ba45ef433b15b"

RPROVIDES:${PN} += "drbd"

RDEPENDS:${PN} += "drbd-utils"

inherit rpm
