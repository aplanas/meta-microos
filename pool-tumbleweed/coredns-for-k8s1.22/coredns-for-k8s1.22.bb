SUMMARY = "DNS server written in Go"
DESCRIPTION = "CoreDNS is a DNS server in Go. It has a plugin architecture for \
extending it. \
 \
CoreDNS can listen for DNS request coming in over UDP/TCP (RFC 1035), \
TLS (RFC 7858) and gRPC (not a standard)."
LICENSE = "Apache-2.0"

PV = "1.8.4"

RPM_NAME = "coredns-for-k8s1.22-1.8.4-1.11.aarch64.rpm"
RPM_HASH = "066eb043e65c05524b0362db43866712a6bfea239a00fa1c46108b13037ff7463a2ae44c75010cc96e6483192bdbd597dd70edd589365e512e43007a5238862e"

RPROVIDES:${PN} += "coredns-for-k8s \
coredns-for-k8s1.22 \
dns-daemon"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
