SUMMARY = "Out-of-kernel stateless NAT64 implementation"
DESCRIPTION = "TAYGA is an out-of-kernel stateless NAT64 implementation for Linux that uses \
the TUN driver to exchange IPv4 and IPv6 packets with the kernel. It is \
intended to provide production-quality NAT64 service for networks where \
dedicated NAT64 hardware would be overkill."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.2"

RPM_NAME = "tayga-0.9.2-2.8.aarch64.rpm"
RPM_HASH = "87a85ef559cd6ddd5cec68886d4de08696990c4a5d1a81bf1320a1227b81567b130f66165c431ee4b1e2d7909e272ed80b3a11f5476dd1d26b8b8d693cb4a44a"

RPROVIDES:${PN} += "config-tayga \
tayga"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
