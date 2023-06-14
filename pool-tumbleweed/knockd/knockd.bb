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

RPM_NAME = "knockd-0.8-2.7.aarch64.rpm"
RPM_HASH = "d1a8eeef0c7daf01eac6161725ee4196be004591f5cc906a9a47824f23390ae02b6933beba84e8db7c4f812f00286bf27f6aa8a79b792e9dec49478f8fc418a4"

RPROVIDES:${PN} += "config-knockd \
knockd"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcap.so.1 \
systemd"

inherit rpm
