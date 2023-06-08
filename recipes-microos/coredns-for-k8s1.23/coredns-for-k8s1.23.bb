SUMMARY = "DNS server written in Go"
DESCRIPTION = "CoreDNS is a DNS server in Go. It has a plugin architecture for \
extending it. \
 \
CoreDNS can listen for DNS request coming in over UDP/TCP (RFC 1035), \
TLS (RFC 7858) and gRPC (not a standard)."
LICENSE = "Apache-2.0"

PV = "1.8.6"

RPM_NAME = "coredns-for-k8s1.23-1.8.6-1.9.aarch64.rpm"
RPM_HASH = "fd176f9a56a36cf116965ed3a314b0e34fb85403c7eee8e3b48101a0ebcd5c75c734b3e9794ba38f42f436e4e8df9d59c7f47d8776854e4cde1d18f117ca7e54"

RPROVIDES:${PN} += "coredns-for-k8s coredns-for-k8s1.23 coredns-for-k8s1.23(aarch-64) dns_daemon"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
