SUMMARY = "Fast, multi-platform web server with automatic HTTPS"
DESCRIPTION = "Caddy is a powerful, extensible platform to serve your sites, services, and \
apps, written in Go. \
 \
It operates primarily at L4 (transport layer) and L7 (application layer) of \
the OSI model, though it has the ability to work with other layers."
LICENSE = "Apache-2.0"

PV = "2.6.4"

RPM_NAME = "caddy-2.6.4-1.1.aarch64.rpm"
RPM_HASH = "9696bb57eb36a79fde75774bfba2eb46c1413752658129ba11597e843d9813c42080e92020b0369b6293d6849ac90abdd106ee2ba1dc48dc179ebab3198b80a5"

RPROVIDES:${PN} += "caddy caddy(aarch-64) config(caddy)"
RDEPENDS:${PN} += "/bin/sh systemd"

inherit rpm
