SUMMARY = "DNS server written in Go"
DESCRIPTION = "CoreDNS is a DNS server in Go. It has a plugin architecture for \
extending it. \
 \
CoreDNS can listen for DNS request coming in over UDP/TCP (RFC 1035), \
TLS (RFC 7858) and gRPC (not a standard)."
LICENSE = "Apache-2.0"

PV = "1.10.0"

RPM_NAME = "coredns-1.10.0-1.3.aarch64.rpm"
RPM_HASH = "5a35a124797b5965e966ea2a343e8ea1b000e70f58fa8b21124297862715d92eb11a365d365b140ccef902c44f97ae7386a8be12b86bae62979ef4a87ac78f88"

RPROVIDES:${PN} += "coredns coredns(aarch-64) dns_daemon"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
