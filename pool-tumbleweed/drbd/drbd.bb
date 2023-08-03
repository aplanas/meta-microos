SUMMARY = "Linux driver for the 'Distributed Replicated Block Device'"
DESCRIPTION = "DRBD is a distributed replicated block device. It mirrors a block \
device over the network to another machine. Think of it as networked \
raid 1. It is a building block for setting up clusters."
LICENSE = "GPL-2.0-or-later"

PV = "9.0.30~1+git.8e9c0812"

RPM_NAME = "drbd-9.0.30~1+git.8e9c0812-8.20.aarch64.rpm"
RPM_HASH = "1ac917fa96bee63af4581574d3249746390bdd9ea5e738a9ca6614501425c65d2ec8653159526a0ecd2ee1b5354db3999db26ba4219c4710be921f4a66666fea"

RPROVIDES:${PN} += "drbd"

RDEPENDS:${PN} += "drbd-utils"

inherit rpm
