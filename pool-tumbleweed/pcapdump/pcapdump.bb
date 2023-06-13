SUMMARY = "Dump packets from the network"
DESCRIPTION = "Command line tool to dump packets from the network. \
 \
pcapdump mimics the very basic features of tcpdump(1) and provides a good \
example of how to use Net::Pcap."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.21"

RPM_NAME = "pcapdump-0.21-1.3.aarch64.rpm"
RPM_HASH = "afa5ddf8fb8ce02101f513f767e40f611c47c647d8338e94dca4e5810362d720ed28e30ff9d6edfd0ef3cdc958eb17c03cb77e69f05e7aa46ab9dd2a434fd045"

RPROVIDES:${PN} += "pcapdump \
pcapdump(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-Net-Pcap"

inherit rpm
