SUMMARY = "DNS server written in Go"
DESCRIPTION = "CoreDNS is a DNS server in Go. It has a plugin architecture for \
extending it. \
 \
CoreDNS can listen for DNS request coming in over UDP/TCP (RFC 1035), \
TLS (RFC 7858) and gRPC (not a standard)."
LICENSE = "Apache-2.0"

PV = "1.9.3"

RPM_NAME = "coredns-for-k8s1.25-1.9.3-1.3.aarch64.rpm"
RPM_HASH = "67f3685af513044bc95d7d8684280dbc76a2a2455d072fc1b7d43c647d905f3df471343d8ca8c9d484ee1df131a7b97539d29f3f1081352e899aac2715f86c5d"

RPROVIDES:${PN} += "coredns-for-k8s \
coredns-for-k8s1.25 \
coredns-for-k8s1.25(aarch-64) \
dns_daemon"

RDEPENDS:${PN} += "libc.so.6()(64bit)"

inherit rpm
