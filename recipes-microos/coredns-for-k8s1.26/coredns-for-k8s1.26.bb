SUMMARY = "DNS server written in Go"
DESCRIPTION = "CoreDNS is a DNS server in Go. It has a plugin architecture for \
extending it. \
 \
CoreDNS can listen for DNS request coming in over UDP/TCP (RFC 1035), \
TLS (RFC 7858) and gRPC (not a standard)."
LICENSE = "Apache-2.0"

PV = "1.9.3"

RPM_NAME = "coredns-for-k8s1.26-1.9.3-1.3.aarch64.rpm"
RPM_HASH = "c82aa6fb99cfa9e13113701ecf4a6bf1488cbd1a9b534d1ed139fcea08d4bad704a9af74161afbb39741046e4020dc29986de3e2bdd7ca094a6c25c1b4e0d24f"

RPROVIDES:${PN} += "coredns-for-k8s coredns-for-k8s1.26 coredns-for-k8s1.26(aarch-64) dns_daemon"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
