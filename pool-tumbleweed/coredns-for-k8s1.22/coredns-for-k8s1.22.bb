SUMMARY = "DNS server written in Go"
DESCRIPTION = "CoreDNS is a DNS server in Go. It has a plugin architecture for \
extending it. \
 \
CoreDNS can listen for DNS request coming in over UDP/TCP (RFC 1035), \
TLS (RFC 7858) and gRPC (not a standard)."
LICENSE = "Apache-2.0"

PV = "1.8.4"

RPM_NAME = "coredns-for-k8s1.22-1.8.4-1.10.aarch64.rpm"
RPM_HASH = "3b42ce2eb50ccf2170d7b2dea7eef4a7a9da7cf799f0e837cfebfc8a2b67c2b8d060c682de5a8f760a07a7b0b6810b6bd552bf62fc1921fa25a959d0313727c2"

RPROVIDES:${PN} += "coredns-for-k8s \
coredns-for-k8s1.22 \
coredns-for-k8s1.22(aarch-64) \
dns_daemon"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
