SUMMARY = "Linux driver for the 'Distributed Replicated Block Device'"
DESCRIPTION = "DRBD is a distributed replicated block device. It mirrors a block \
device over the network to another machine. Think of it as networked \
raid 1. It is a building block for setting up clusters."
LICENSE = "GPL-2.0-or-later"

PV = "9.0.30~1+git.8e9c0812"

RPM_NAME = "drbd-9.0.30~1+git.8e9c0812-8.16.aarch64.rpm"
RPM_HASH = "f0636c17ab6d3d2866d233d136a2a26bcc4b407850a2db1e28113391b2fc8189e6eb57ef40cf1c8b7022277b680f9076ed0988c28f97e0f0b5606c1d284d2367"

RPROVIDES:${PN} += "drbd"

RDEPENDS:${PN} += "drbd-utils"

inherit rpm
