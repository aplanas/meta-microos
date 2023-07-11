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

RPM_NAME = "knock-0.8-2.8.aarch64.rpm"
RPM_HASH = "865c727d6714e54ef7fc0a9b616093953dafbfaa046fee67c675d9824b829107151feeb3139ac7d29e618308b3a1da3e5a747c3568530693e19e83b52951f283"

RPROVIDES:${PN} += "knock"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
