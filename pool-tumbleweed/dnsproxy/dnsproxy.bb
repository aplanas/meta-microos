SUMMARY = "A DNS proxy server"
DESCRIPTION = "A DNS proxy server that supports numerous protocols, including \
DNS-over-TLS, DNS-over-HTTPS, DNSCrypt, and DNS-over-QUIC. Moreover, \
it can work as a DNS-over-HTTPS, DNS-over-TLS or DNS-over-QUIC \
server."
LICENSE = "Apache-2.0"

PV = "0.52.0"

RPM_NAME = "dnsproxy-0.52.0-1.1.aarch64.rpm"
RPM_HASH = "6499ce3c964318d9c66cd5023bf59ba4d058a08563f96f81a0cfb6ea4d36670ab498511997a622dc1f7e427212c254e370e83e38f3e144421f2460c937ffbb1b"

RPROVIDES:${PN} += "dnsproxy"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
