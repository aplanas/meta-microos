SUMMARY = "DNS server written in Go"
DESCRIPTION = "CoreDNS is a DNS server in Go. It has a plugin architecture for \
extending it. \
 \
CoreDNS can listen for DNS request coming in over UDP/TCP (RFC 1035), \
TLS (RFC 7858) and gRPC (not a standard)."
LICENSE = "Apache-2.0"

PV = "1.9.3"

RPM_NAME = "coredns-for-k8s1.25-1.9.3-1.2.aarch64.rpm"
RPM_HASH = "75fbb1fafbda2718b0279acd61f5ba1527ba45b0289e77313cb5a9bc301ca493462e47be27f28803666d9e584d48859a075edca8f2d54bf71542e6aa19b3a1f6"

RPROVIDES:${PN} += "coredns-for-k8s coredns-for-k8s1.25 coredns-for-k8s1.25(aarch-64) dns_daemon"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
