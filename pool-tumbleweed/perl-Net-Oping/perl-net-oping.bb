SUMMARY = "Multiple Host Ping that supports ICMPv4 and ICMPv6"
DESCRIPTION = "Net::Oping is for measuring network latency using ICMP echo requests. \
It can send to and receive packets from multiple hosts in parallel, which is \
nice for monitoring applications. Both IPv4 and IPv6 are supported \
transparently."
LICENSE = "LGPL-2.1-only"

PV = "1.10.0"

RPM_NAME = "perl-Net-Oping-1.10.0-1.19.aarch64.rpm"
RPM_HASH = "0a2457ce4823adca89eb3b2317643216b7cb38d774aec4c6250de1eb75a4ad09ebbec76a8c0e5951244e99589d408319d24f20ede602199b718f4a93c702ed31"

RPROVIDES:${PN} += "perl-Net--Oping \
perl-Net-Oping"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl"

inherit rpm
