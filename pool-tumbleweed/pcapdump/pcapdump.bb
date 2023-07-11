SUMMARY = "Dump packets from the network"
DESCRIPTION = "Command line tool to dump packets from the network. \
 \
pcapdump mimics the very basic features of tcpdump(1) and provides a good \
example of how to use Net::Pcap."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.21"

RPM_NAME = "pcapdump-0.21-1.4.aarch64.rpm"
RPM_HASH = "33ca8492d2758e30a3f1c406d769bdf23335ef5bf4da602e2d7a87adcfa9b6cb7aa431984675613195d1bba017f4aeb3e8d4b947a174aabb11e38ae72e6f06b4"

RPROVIDES:${PN} += "pcapdump"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-Net-Pcap"

inherit rpm
