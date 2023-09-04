SUMMARY = "Fast, multi-platform web server with automatic HTTPS"
DESCRIPTION = "Caddy is a powerful, extensible platform to serve your sites, services, and \
apps, written in Go. \
 \
It operates primarily at L4 (transport layer) and L7 (application layer) of \
the OSI model, though it has the ability to work with other layers."
LICENSE = "Apache-2.0"

PV = "2.7.4"

RPM_NAME = "caddy-2.7.4-1.1.aarch64.rpm"
RPM_HASH = "bec0640ba6da36155c55284dc9fff004320c4d4a3f471ae99f27e0c187c153b15040a04928ca6f0ee35957135b869488e069a96242a4bef8c6daa6f66dc1265a"

RPROVIDES:${PN} += "caddy \
config-caddy"

RDEPENDS:${PN} += "/usr/bin/sh \
systemd"

inherit rpm
