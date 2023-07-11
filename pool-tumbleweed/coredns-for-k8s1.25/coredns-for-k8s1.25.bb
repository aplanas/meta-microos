SUMMARY = "DNS server written in Go"
DESCRIPTION = "CoreDNS is a DNS server in Go. It has a plugin architecture for \
extending it. \
 \
CoreDNS can listen for DNS request coming in over UDP/TCP (RFC 1035), \
TLS (RFC 7858) and gRPC (not a standard)."
LICENSE = "Apache-2.0"

PV = "1.9.3"

RPM_NAME = "coredns-for-k8s1.25-1.9.3-1.4.aarch64.rpm"
RPM_HASH = "bc2c1e79e9072ec5a79906d3dc0f6cb3f075d38047c1ad97921a960dd2e2e1598a20dd55d96954c5d480181ce9e5b0cf90525ce1c5d2c3cd3a26cd33cc562a44"

RPROVIDES:${PN} += "coredns-for-k8s \
coredns-for-k8s1.25 \
dns-daemon"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
