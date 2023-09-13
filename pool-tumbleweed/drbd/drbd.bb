SUMMARY = "Linux driver for the 'Distributed Replicated Block Device'"
DESCRIPTION = "DRBD is a distributed replicated block device. It mirrors a block \
device over the network to another machine. Think of it as networked \
raid 1. It is a building block for setting up clusters."
LICENSE = "GPL-2.0-or-later"

PV = "9.1.16"

RPM_NAME = "drbd-9.1.16-1.1.aarch64.rpm"
RPM_HASH = "76550889ba5a163c51a9d59a3cbe87de0ef880d6fd6fd7c19887672692fcf0c0dfe3b57391d62bcb04cf50af8c80dc71558c7f1dc4189e4a1202abdd9c7fcdab"

RPROVIDES:${PN} += "drbd"

RDEPENDS:${PN} += "drbd-utils"

inherit rpm
