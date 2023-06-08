SUMMARY = "Linux driver for the 'Distributed Replicated Block Device'"
DESCRIPTION = "DRBD is a distributed replicated block device. It mirrors a block \
device over the network to another machine. Think of it as networked \
raid 1. It is a building block for setting up clusters."
LICENSE = "GPL-2.0-or-later"

PV = "9.0.30~1+git.8e9c0812"

RPM_NAME = "drbd-9.0.30~1+git.8e9c0812-8.9.aarch64.rpm"
RPM_HASH = "3de8215ab8bc9e9e5fd6f14598d519a5466185a2ba3027d514b616e9050035765e7e93d98854dd3db5a3a9dba4a5e7000b9fa0fbed625af8bfbcace1426bf3e8"

RPROVIDES:${PN} += "drbd drbd(aarch-64)"
RDEPENDS:${PN} += "drbd-utils"

inherit rpm
