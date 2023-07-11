SUMMARY = "Packet generator"
DESCRIPTION = "Nping is a tool for network packet generation, response \
analysis and response time measurement. Nping allows to generate network \
packets of a wide range of protocols, letting users to tune virtually \
any field of the protocol headers. While Nping can be used as a simple \
ping utility to detect active hosts, it can also be used as a raw packet \
generator for network stack stress tests, ARP poisoning, Denial of \
Service attacks, route tracing, etc."
LICENSE = "GPL-2.0-or-later"

PV = "7.93"

RPM_NAME = "nping-7.93-1.4.aarch64.rpm"
RPM_HASH = "7b2a18514c7f3f652ca88a3749de9b7e2ff08a045d0f559de627f5e8affc19a7cd8c0a689e8c97de01c59742ba7a5784850f967999f8b480e401d2f40577ced4"

RPROVIDES:${PN} += "nping"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libpcap.so.1 \
libssl.so.3 \
libstdc++.so.6"

inherit rpm
