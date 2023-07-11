SUMMARY = "DNS server written in Go"
DESCRIPTION = "CoreDNS is a DNS server in Go. It has a plugin architecture for \
extending it. \
 \
CoreDNS can listen for DNS request coming in over UDP/TCP (RFC 1035), \
TLS (RFC 7858) and gRPC (not a standard)."
LICENSE = "Apache-2.0"

PV = "1.8.0"

RPM_NAME = "coredns-for-k8s1.21-1.8.0-1.12.aarch64.rpm"
RPM_HASH = "ff7ebfb7e5cc0dcba676a3384a9f641788c2f3c0b6570fa0b27df4f864178e84568b07357b9b752fbaed930e89d62c3e04b57d9186411c94d296775a688fb30d"

RPROVIDES:${PN} += "coredns-for-k8s \
coredns-for-k8s1.21 \
dns-daemon"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
