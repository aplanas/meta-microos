SUMMARY = "A DNS proxy server"
DESCRIPTION = "A DNS proxy server that supports numerous protocols, including \
DNS-over-TLS, DNS-over-HTTPS, DNSCrypt, and DNS-over-QUIC. Moreover, \
it can work as a DNS-over-HTTPS, DNS-over-TLS or DNS-over-QUIC \
server."
LICENSE = "Apache-2.0"

PV = "0.51.0"

RPM_NAME = "dnsproxy-0.51.0-1.1.aarch64.rpm"
RPM_HASH = "e44224a038030e566ed4a1197f7d16187ef231f77bc3dca37cb7df1d42971d5970ee9e11c6283ec6d84f9eab94e3c635935f03531e436ffc3bdd5e3d3383bd9e"

RPROVIDES:${PN} += "dnsproxy"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
