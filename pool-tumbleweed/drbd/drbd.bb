SUMMARY = "Linux driver for the 'Distributed Replicated Block Device'"
DESCRIPTION = "DRBD is a distributed replicated block device. It mirrors a block \
device over the network to another machine. Think of it as networked \
raid 1. It is a building block for setting up clusters."
LICENSE = "GPL-2.0-or-later"

PV = "9.0.30~1+git.8e9c0812"

RPM_NAME = "drbd-9.0.30~1+git.8e9c0812-8.23.aarch64.rpm"
RPM_HASH = "bddb294a86b9308e4c2a6d2b625f2f6424a9db4f717db077265c22c333aa69962f34866859ab9ad4cf56ee6622508af3079bb755c7baa3719372817295f09199"

RPROVIDES:${PN} += "drbd"

RDEPENDS:${PN} += "drbd-utils"

inherit rpm
