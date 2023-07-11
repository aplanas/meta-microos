SUMMARY = "DNS server written in Go"
DESCRIPTION = "CoreDNS is a DNS server in Go. It has a plugin architecture for \
extending it. \
 \
CoreDNS can listen for DNS request coming in over UDP/TCP (RFC 1035), \
TLS (RFC 7858) and gRPC (not a standard)."
LICENSE = "Apache-2.0"

PV = "1.10.0"

RPM_NAME = "coredns-1.10.0-1.5.aarch64.rpm"
RPM_HASH = "76ad483f7a9d31779281c778d124fd10c8774bcddc31b355ff9dea5e9b0ac1c917233e579f731ac8bd17a093cb57aadfdb20d4008486a4e51659ec14a8c5146a"

RPROVIDES:${PN} += "coredns \
dns-daemon"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
