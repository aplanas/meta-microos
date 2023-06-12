SUMMARY = "Fast, multi-platform web server with automatic HTTPS"
DESCRIPTION = "Caddy is a powerful, extensible platform to serve your sites, services, and \
apps, written in Go. \
 \
It operates primarily at L4 (transport layer) and L7 (application layer) of \
the OSI model, though it has the ability to work with other layers."
LICENSE = "Apache-2.0"

PV = "2.6.4"

RPM_NAME = "caddy-2.6.4-1.2.aarch64.rpm"
RPM_HASH = "8161594a77f2a6e69d1098fe429cb6ab870206425d5769868db098c33a5af41149b68950febd982722e4835656531729e496d3a18647144aba45dfccdcb724c7"

RPROVIDES:${PN} += "caddy \
caddy(aarch-64) \
config(caddy)"
RDEPENDS:${PN} += "/bin/sh \
systemd"

inherit rpm
