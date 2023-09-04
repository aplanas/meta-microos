SUMMARY = "Dump packets from the network"
DESCRIPTION = "Command line tool to dump packets from the network. \
 \
pcapdump mimics the very basic features of tcpdump(1) and provides a good \
example of how to use Net::Pcap."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.21"

RPM_NAME = "pcapdump-0.21-1.5.aarch64.rpm"
RPM_HASH = "f53ce753731adf7b183473e4c921fd84c65e58495287af9f78e16a106b0e5668649e14648f72cc0034948ef008835c613bc1a4e9b2a2003dc3bd91a55cd23265"

RPROVIDES:${PN} += "pcapdump"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-Net-Pcap"

inherit rpm
