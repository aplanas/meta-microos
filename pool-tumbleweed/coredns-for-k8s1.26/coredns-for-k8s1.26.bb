SUMMARY = "DNS server written in Go"
DESCRIPTION = "CoreDNS is a DNS server in Go. It has a plugin architecture for \
extending it. \
 \
CoreDNS can listen for DNS request coming in over UDP/TCP (RFC 1035), \
TLS (RFC 7858) and gRPC (not a standard)."
LICENSE = "Apache-2.0"

PV = "1.9.3"

RPM_NAME = "coredns-for-k8s1.26-1.9.3-1.5.aarch64.rpm"
RPM_HASH = "d5bc57e4b13908de24f241a069195c3efd7b8490572a78b58a61f7ac0fde66d199dd8217d313349a329d7ba6cd99174e8c40d27a1f4778225c0c3f6cf3b19368"

RPROVIDES:${PN} += "coredns-for-k8s \
coredns-for-k8s1.26 \
dns-daemon"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
