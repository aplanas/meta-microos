SUMMARY = "DNS server written in Go"
DESCRIPTION = "CoreDNS is a DNS server in Go. It has a plugin architecture for \
extending it. \
 \
CoreDNS can listen for DNS request coming in over UDP/TCP (RFC 1035), \
TLS (RFC 7858) and gRPC (not a standard)."
LICENSE = "Apache-2.0"

PV = "1.8.0"

RPM_NAME = "coredns-for-k8s1.21-1.8.0-1.11.aarch64.rpm"
RPM_HASH = "5584e53f7545fe76c0097fdd6cebec492c027a8ff321f07a19ae485d8f9acfbef73df0bcb880a80b981abef958ae1d2de354a1fe93450a72e5779838825f742e"

RPROVIDES:${PN} += "coredns-for-k8s \
coredns-for-k8s1.21 \
coredns-for-k8s1.21(aarch-64) \
dns_daemon"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
