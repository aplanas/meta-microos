SUMMARY = "DNS server written in Go"
DESCRIPTION = "CoreDNS is a DNS server in Go. It has a plugin architecture for \
extending it. \
 \
CoreDNS can listen for DNS request coming in over UDP/TCP (RFC 1035), \
TLS (RFC 7858) and gRPC (not a standard)."
LICENSE = "Apache-2.0"

PV = "1.8.0"

RPM_NAME = "coredns-for-k8s1.21-1.8.0-1.10.aarch64.rpm"
RPM_HASH = "fe8fcdbd9425f4bb1518ab6a63a6b66a8af21d1bdb2a3de57f4776506cd47575449d928a1d206a951b687cb0e8cf143ef0923ac155fa03c48f494a2afe429e29"

RPROVIDES:${PN} += "coredns-for-k8s coredns-for-k8s1.21 coredns-for-k8s1.21(aarch-64) dns_daemon"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
