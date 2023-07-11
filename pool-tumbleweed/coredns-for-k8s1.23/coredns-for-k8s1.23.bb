SUMMARY = "DNS server written in Go"
DESCRIPTION = "CoreDNS is a DNS server in Go. It has a plugin architecture for \
extending it. \
 \
CoreDNS can listen for DNS request coming in over UDP/TCP (RFC 1035), \
TLS (RFC 7858) and gRPC (not a standard)."
LICENSE = "Apache-2.0"

PV = "1.8.6"

RPM_NAME = "coredns-for-k8s1.23-1.8.6-1.11.aarch64.rpm"
RPM_HASH = "b05caf0a2120b0c4de95120509e781bf0d537d7071c8026ff38a7ab196faa96dbd3ccebda3efe0267707f30bf911618e1e02408d619542a5c3644f55f02a95c9"

RPROVIDES:${PN} += "coredns-for-k8s \
coredns-for-k8s1.23 \
dns-daemon"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
