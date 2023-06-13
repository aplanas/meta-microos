SUMMARY = "DNS server written in Go"
DESCRIPTION = "CoreDNS is a DNS server in Go. It has a plugin architecture for \
extending it. \
 \
CoreDNS can listen for DNS request coming in over UDP/TCP (RFC 1035), \
TLS (RFC 7858) and gRPC (not a standard)."
LICENSE = "Apache-2.0"

PV = "1.10.0"

RPM_NAME = "coredns-1.10.0-1.4.aarch64.rpm"
RPM_HASH = "97d8c423824746f62c0c603dafdfbe7e7ec6907d38b4ca0afbe673e8e6e7a4e260100e4e672e1f5e370f45a02f584035f6f6bc8f0e9c14fec16d55db45ec8577"

RPROVIDES:${PN} += "coredns \
coredns(aarch-64) \
dns_daemon"

RDEPENDS:${PN} += "libc.so.6()(64bit)"

inherit rpm
