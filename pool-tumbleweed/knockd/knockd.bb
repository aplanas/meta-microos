SUMMARY = "A port-knocking server"
DESCRIPTION = "It listens to all traffic on an ethernet (or PPP) interface, looking \
for special 'knock' sequences of port-hits. A client (package knock) \
makes these port-hits by sending a TCP (or UDP) packet to a port on the \
server. This port need not be open -- since knockd listens at the \
link-layer level, it sees all traffic even if it's destined for a \
closed port. When the server detects a specific sequence of port-hits, \
it runs a command defined in its configuration file. This can be used \
to open up holes in a firewall for quick access."
LICENSE = "GPL-2.0-or-later"

PV = "0.8"

RPM_NAME = "knockd-0.8-2.8.aarch64.rpm"
RPM_HASH = "373a8ba395674113ee1f2ed1d34738819dac847d1e23af0828a4a21ac4ebffb4bb7836f48cb631f0e91232a612c574145f4162ef0a35ce4829cf6663b803a867"

RPROVIDES:${PN} += "config-knockd \
knockd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcap.so.1 \
systemd"

inherit rpm
