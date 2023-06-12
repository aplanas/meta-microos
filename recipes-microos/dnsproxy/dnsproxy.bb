SUMMARY = "A DNS proxy server"
DESCRIPTION = "A DNS proxy server that supports numerous protocols, including \
DNS-over-TLS, DNS-over-HTTPS, DNSCrypt, and DNS-over-QUIC. Moreover, \
it can work as a DNS-over-HTTPS, DNS-over-TLS or DNS-over-QUIC \
server."
LICENSE = "Apache-2.0"

PV = "0.49.1"

RPM_NAME = "dnsproxy-0.49.1-1.1.aarch64.rpm"
RPM_HASH = "62c68fa4e1e5b0425edb7535a1b71847dba2ad0cc8ce797353a97c45ce593d1daa99cb1f5d44b190571795e9b57d43d8e283778cf652eed403d7b36d62bd1bd3"

RPROVIDES:${PN} += "dnsproxy \
dnsproxy(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
