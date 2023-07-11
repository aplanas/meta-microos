SUMMARY = "Out-of-kernel stateless NAT64 implementation"
DESCRIPTION = "TAYGA is an out-of-kernel stateless NAT64 implementation for Linux that uses \
the TUN driver to exchange IPv4 and IPv6 packets with the kernel. It is \
intended to provide production-quality NAT64 service for networks where \
dedicated NAT64 hardware would be overkill."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.2"

RPM_NAME = "tayga-0.9.2-2.9.aarch64.rpm"
RPM_HASH = "db33172ae9cc838ef2cec305f448ace807e6e142a6677ed1990251dec3c30739ad78141f84d7a3fa2593576074267bc48d14f65e0b00157c4d7790f532f7750a"

RPROVIDES:${PN} += "config-tayga \
tayga"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
