SUMMARY = "DNS server written in Go"
DESCRIPTION = "CoreDNS is a DNS server in Go. It has a plugin architecture for \
extending it. \
 \
CoreDNS can listen for DNS request coming in over UDP/TCP (RFC 1035), \
TLS (RFC 7858) and gRPC (not a standard)."
LICENSE = "Apache-2.0"

PV = "1.8.6"

RPM_NAME = "coredns-for-k8s1.24-1.8.6-1.6.aarch64.rpm"
RPM_HASH = "2cd3924030bab6d011e5a9fbd9e29fcc368344a99ee9d4a57e3ae9d6cd649f7f563928a09369af893359b8e21eef6baaf4d3615a83acb194f20d90112553c4c6"

RPROVIDES:${PN} += "coredns-for-k8s \
coredns-for-k8s1.24 \
coredns-for-k8s1.24(aarch-64) \
dns_daemon"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
