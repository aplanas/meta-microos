SUMMARY = "DNS server written in Go"
DESCRIPTION = "CoreDNS is a DNS server in Go. It has a plugin architecture for \
extending it. \
 \
CoreDNS can listen for DNS request coming in over UDP/TCP (RFC 1035), \
TLS (RFC 7858) and gRPC (not a standard)."
LICENSE = "Apache-2.0"

PV = "1.8.4"

RPM_NAME = "coredns-for-k8s1.22-1.8.4-1.9.aarch64.rpm"
RPM_HASH = "c5c3e28d0195eec86000aeff8fcbc39006fc3425931314fb039c1a14f9bbdba3862934641cda6aa76d5f303c79ffebc2957e8e8fb75d5c71455c627bc99bab00"

RPROVIDES:${PN} += "coredns-for-k8s coredns-for-k8s1.22 coredns-for-k8s1.22(aarch-64) dns_daemon"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
