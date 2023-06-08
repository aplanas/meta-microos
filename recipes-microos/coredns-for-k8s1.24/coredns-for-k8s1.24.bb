SUMMARY = "DNS server written in Go"
DESCRIPTION = "CoreDNS is a DNS server in Go. It has a plugin architecture for \
extending it. \
 \
CoreDNS can listen for DNS request coming in over UDP/TCP (RFC 1035), \
TLS (RFC 7858) and gRPC (not a standard)."
LICENSE = "Apache-2.0"

PV = "1.8.6"

RPM_NAME = "coredns-for-k8s1.24-1.8.6-1.5.aarch64.rpm"
RPM_HASH = "0274b981b2e554309a2f5edef781483c56c96f30f3fcb509fb02bea94a644dc71ca8f79d2b5b2120469b559e4ba0989336b2a3c3571acdd8766ec2dfee5c18d3"

RPROVIDES:${PN} += "coredns-for-k8s coredns-for-k8s1.24 coredns-for-k8s1.24(aarch-64) dns_daemon"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
