SUMMARY = "Linux driver for the 'Distributed Replicated Block Device'"
DESCRIPTION = "DRBD is a distributed replicated block device. It mirrors a block \
device over the network to another machine. Think of it as networked \
raid 1. It is a building block for setting up clusters."
LICENSE = "GPL-2.0-or-later"

PV = "9.0.30~1+git.8e9c0812"

RPM_NAME = "drbd-9.0.30~1+git.8e9c0812-8.12.aarch64.rpm"
RPM_HASH = "4d89c31e368daf4527faf87fc1ce8dee7dd06c5c2e2d95d176c0b22d7ce79752e0a288ebd87a42285819b8c397c84868e233881f9058b71998fd0196ad96c2bb"

RPROVIDES:${PN} += "drbd drbd(aarch-64)"
RDEPENDS:${PN} += "drbd-utils"

inherit rpm
