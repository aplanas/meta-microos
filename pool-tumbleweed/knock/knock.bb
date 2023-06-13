SUMMARY = "A Port-Knocking Client"
DESCRIPTION = "The server part (package knockd) listens to all traffic on an ethernet \
(or PPP) interface, looking for special 'knock' sequences of port hits. \
This client makes these port hits by sending a TCP (or UDP) packet to a \
port on the server. This port does not need to be open. Since knockd \
listens at the link-layer level, it sees all traffic even if it is \
destined for a closed port. When the server detects a specific sequence \
of port hits, it runs a command defined in its configuration file. This \
can be used to open up holes in a firewall for quick access."
LICENSE = "GPL-2.0-or-later"

PV = "0.8"

RPM_NAME = "knock-0.8-2.7.aarch64.rpm"
RPM_HASH = "b79866d1241988de8ebb6ee07e1b95887130e0e07a9a500f1357d6f4c0341ce9cbb603e9aa81e2a02addc70dcc6ab58e45e4baa1c50a1c34cfd3b6bb448f1c94"

RPROVIDES:${PN} += "knock \
knock(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
