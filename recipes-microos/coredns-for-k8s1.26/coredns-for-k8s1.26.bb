SUMMARY = "DNS server written in Go"
DESCRIPTION = "CoreDNS is a DNS server in Go. It has a plugin architecture for \
extending it. \
 \
CoreDNS can listen for DNS request coming in over UDP/TCP (RFC 1035), \
TLS (RFC 7858) and gRPC (not a standard)."
LICENSE = "Apache-2.0"

PV = "1.9.3"

RPM_NAME = "coredns-for-k8s1.26-1.9.3-1.4.aarch64.rpm"
RPM_HASH = "f731fb67fc70661b27ee2ae2d20eeb09b0127fee9745a20a3cb3d0aa8893b8b29e06e01880ca70468e7876f2e442371b4963b5ede6452838ac5caec9e22dfa18"

RPROVIDES:${PN} += "coredns-for-k8s coredns-for-k8s1.26 coredns-for-k8s1.26(aarch-64) dns_daemon"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
