SUMMARY = "Linux driver for the 'Distributed Replicated Block Device'"
DESCRIPTION = "DRBD is a distributed replicated block device. It mirrors a block \
device over the network to another machine. Think of it as networked \
raid 1. It is a building block for setting up clusters."
LICENSE = "GPL-2.0-or-later"

PV = "9.0.30~1+git.8e9c0812"

RPM_NAME = "drbd-9.0.30~1+git.8e9c0812-8.24.aarch64.rpm"
RPM_HASH = "a9d2c36ba82872e818041e6a547dc7c79a31a18cf0a6e3e946bf75a943fda57ca085d509e18dc6c4276f78ba397a8874ae67682af01a6d09ec686712eb2a9b63"

RPROVIDES:${PN} += "drbd"

RDEPENDS:${PN} += "drbd-utils"

inherit rpm
