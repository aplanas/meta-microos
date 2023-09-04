SUMMARY = "Multiple Host Ping that supports ICMPv4 and ICMPv6"
DESCRIPTION = "Net::Oping is for measuring network latency using ICMP echo requests. \
It can send to and receive packets from multiple hosts in parallel, which is \
nice for monitoring applications. Both IPv4 and IPv6 are supported \
transparently."
LICENSE = "LGPL-2.1-only"

PV = "1.10.0"

RPM_NAME = "perl-Net-Oping-1.10.0-1.20.aarch64.rpm"
RPM_HASH = "adbfcf161bcc99ead538f7ba431bb61c9b84cae7e74bd2ded4dc4751554b39a53ea0228b8f1cbcf81631b337d28ac517f347356b866bc7c73c7bc22942aecfb1"

RPROVIDES:${PN} += "perl-Net--Oping \
perl-Net-Oping"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl"

inherit rpm
