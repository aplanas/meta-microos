SUMMARY = "DNS server written in Go"
DESCRIPTION = "CoreDNS is a DNS server in Go. It has a plugin architecture for \
extending it. \
 \
CoreDNS can listen for DNS request coming in over UDP/TCP (RFC 1035), \
TLS (RFC 7858) and gRPC (not a standard)."
LICENSE = "Apache-2.0"

PV = "1.10.1"

RPM_NAME = "coredns-for-k8s1.27-1.10.1-1.1.aarch64.rpm"
RPM_HASH = "a0f7710477dd408145054e1495ab3faa13b5e21bff0fcbd2355e5e7fa9131a2da6927b249c5e9deb0d1b43299d5da226afd0a1e24f2ec8c706f847bbd44e7fd9"

RPROVIDES:${PN} += "coredns-for-k8s \
coredns-for-k8s1.27 \
coredns-for-k8s1.27(aarch-64) \
dns_daemon"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
