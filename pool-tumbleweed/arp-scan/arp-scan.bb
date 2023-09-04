SUMMARY = "ARP scanning and fingerprinting tool"
DESCRIPTION = "arp-scan is a command-line tool that uses the ARP protocol to discover and fingerprint IP hosts on the local network."
LICENSE = "GPL-3.0-only & LGPL-2.1-only & ISC"

PV = "1.10.0"

RPM_NAME = "arp-scan-1.10.0-1.4.aarch64.rpm"
RPM_HASH = "1efeb3e803743c4e7e1f54069ec2d14c17712a314dc495f96821ec18c126715e14655a15e92adc30178860fbebbaaade36b275ddb31ce5697635a7aff9473a67"

RPROVIDES:${PN} += "arp-scan \
config-arp-scan"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libpcap.so.1 \
perl--MODULE-COMPAT-5.38.0 \
perl-LWP--Simple"

inherit rpm
