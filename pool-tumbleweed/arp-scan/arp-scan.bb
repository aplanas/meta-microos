SUMMARY = "ARP scanning and fingerprinting tool"
DESCRIPTION = "arp-scan is a command-line tool that uses the ARP protocol to discover and fingerprint IP hosts on the local network."
LICENSE = "GPL-3.0-only & LGPL-2.1-only & ISC"

PV = "1.10.0"

RPM_NAME = "arp-scan-1.10.0-1.3.aarch64.rpm"
RPM_HASH = "5012465cf17b850a027c81cfb43b1e8db314aa33a23c9a1350e34f8d93536b13cf3729c6c7db2e313e95637a69f15661500445e63749fec147251406ebf2397e"

RPROVIDES:${PN} += "arp-scan \
config-arp-scan"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libpcap.so.1 \
perl--MODULE-COMPAT-5.36.1 \
perl-LWP--Simple"

inherit rpm
