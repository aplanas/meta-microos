SUMMARY = "DNS server written in Go"
DESCRIPTION = "CoreDNS is a DNS server in Go. It has a plugin architecture for \
extending it. \
 \
CoreDNS can listen for DNS request coming in over UDP/TCP (RFC 1035), \
TLS (RFC 7858) and gRPC (not a standard)."
LICENSE = "Apache-2.0"

PV = "1.10.1"

RPM_NAME = "coredns-for-k8s1.27-1.10.1-1.2.aarch64.rpm"
RPM_HASH = "ef4599366d39cc73a50c6f3ae96a9c75ad4f7e872891b22e60ec32bbb938b25a8096aae1862f1b7bff7a5221bb14ade78b6ec544b6c68afd98c17814f9812a98"

RPROVIDES:${PN} += "coredns-for-k8s \
coredns-for-k8s1.27 \
dns-daemon"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
