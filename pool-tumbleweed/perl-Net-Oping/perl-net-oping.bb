SUMMARY = "Multiple Host Ping that supports ICMPv4 and ICMPv6"
DESCRIPTION = "Net::Oping is for measuring network latency using ICMP echo requests. \
It can send to and receive packets from multiple hosts in parallel, which is \
nice for monitoring applications. Both IPv4 and IPv6 are supported \
transparently."
LICENSE = "LGPL-2.1-only"

PV = "1.10.0"

RPM_NAME = "perl-Net-Oping-1.10.0-1.18.aarch64.rpm"
RPM_HASH = "85949803695eaaa2170977b98262930246dc95652b87b954ec3052a00dfdd2c80b674d0342069e17061d66fe059a9a39c29e40142eca0b9f540052861e93a830"

RPROVIDES:${PN} += "perl-Net--Oping \
perl-Net-Oping"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl"

inherit rpm
