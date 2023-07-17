SUMMARY = "Linux driver for the 'Distributed Replicated Block Device'"
DESCRIPTION = "DRBD is a distributed replicated block device. It mirrors a block \
device over the network to another machine. Think of it as networked \
raid 1. It is a building block for setting up clusters."
LICENSE = "GPL-2.0-or-later"

PV = "9.0.30~1+git.8e9c0812"

RPM_NAME = "drbd-9.0.30~1+git.8e9c0812-8.17.aarch64.rpm"
RPM_HASH = "ebd57e3c510c3557d21c49fc83328b0fa966535f009c889648a4b8065f52f7769842f325bd077a3c7c6304e04ebdf7f7bef9710313856b60f5f1feaeaeaced87"

RPROVIDES:${PN} += "drbd"

RDEPENDS:${PN} += "drbd-utils"

inherit rpm
