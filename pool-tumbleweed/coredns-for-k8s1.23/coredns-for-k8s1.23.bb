SUMMARY = "DNS server written in Go"
DESCRIPTION = "CoreDNS is a DNS server in Go. It has a plugin architecture for \
extending it. \
 \
CoreDNS can listen for DNS request coming in over UDP/TCP (RFC 1035), \
TLS (RFC 7858) and gRPC (not a standard)."
LICENSE = "Apache-2.0"

PV = "1.8.6"

RPM_NAME = "coredns-for-k8s1.23-1.8.6-1.10.aarch64.rpm"
RPM_HASH = "ae705f685b4b57c246079bc6cddeec97a2eeeb7e5c93234cd72fe51e4512ef8cdfdd8d20aafd3e8dfb36df61bf97564c9adf1e718f37a9cc35bdc60a04102b2f"

RPROVIDES:${PN} += "coredns-for-k8s \
coredns-for-k8s1.23 \
coredns-for-k8s1.23(aarch-64) \
dns_daemon"

RDEPENDS:${PN} += "libc.so.6()(64bit)"

inherit rpm
