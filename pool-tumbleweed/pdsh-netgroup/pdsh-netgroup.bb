SUMMARY = "Netgroup plugin for pdsh"
DESCRIPTION = "Plugin for pdsh to determine nodes to run on from netgroups."
LICENSE = "GPL-2.0-or-later"

PV = "2.34"

RPM_NAME = "pdsh-netgroup-2.34-12.1.aarch64.rpm"
RPM_HASH = "464be2d9dfd81b79ca07725222d237d5acdc6d03c9a4fcf6db3f9d1a6797a3c3cadfc347394c538bcceb527807a004b7ab8f3dc68c46079f58f922caf93c2c34"

RPROVIDES:${PN} += "pdsh-netgroup"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
pdsh"

inherit rpm
