SUMMARY = "DNS server written in Go"
DESCRIPTION = "CoreDNS is a DNS server in Go. It has a plugin architecture for \
extending it. \
 \
CoreDNS can listen for DNS request coming in over UDP/TCP (RFC 1035), \
TLS (RFC 7858) and gRPC (not a standard)."
LICENSE = "Apache-2.0"

PV = "1.8.6"

RPM_NAME = "coredns-for-k8s1.24-1.8.6-1.7.aarch64.rpm"
RPM_HASH = "f10bb91284697f41bedddca9b2bf6e34e533cd785373a393a61ccdc1796c1fc623983943c1b445a09053f78eb9d35647e5cdca4cbbddf3eae6b7ee1799dbf6e7"

RPROVIDES:${PN} += "coredns-for-k8s \
coredns-for-k8s1.24 \
dns-daemon"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
