SUMMARY = "A DNS proxy server"
DESCRIPTION = "A DNS proxy server that supports numerous protocols, including \
DNS-over-TLS, DNS-over-HTTPS, DNSCrypt, and DNS-over-QUIC. Moreover, \
it can work as a DNS-over-HTTPS, DNS-over-TLS or DNS-over-QUIC \
server."
LICENSE = "Apache-2.0"

PV = "0.54.0"

RPM_NAME = "dnsproxy-0.54.0-1.1.aarch64.rpm"
RPM_HASH = "1d9f177939884b8adc05917dece7d546f639d11162616fb18ea8a4a6655610b17d861ddb7bde1cac7ab579c44945eb29ec33d85d1ff8121971a7691813ca3434"

RPROVIDES:${PN} += "dnsproxy"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
