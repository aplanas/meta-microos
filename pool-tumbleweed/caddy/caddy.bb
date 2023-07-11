SUMMARY = "Fast, multi-platform web server with automatic HTTPS"
DESCRIPTION = "Caddy is a powerful, extensible platform to serve your sites, services, and \
apps, written in Go. \
 \
It operates primarily at L4 (transport layer) and L7 (application layer) of \
the OSI model, though it has the ability to work with other layers."
LICENSE = "Apache-2.0"

PV = "2.6.4"

RPM_NAME = "caddy-2.6.4-1.3.aarch64.rpm"
RPM_HASH = "2245ba36b4fdf5885f444a4be4f33ebe2840e00e7d49e87259f134024461cc5ab92fc59cf2a0828c3ec5bd40eff270533c167fe09b9324b05aaced665f008fef"

RPROVIDES:${PN} += "caddy \
config-caddy"

RDEPENDS:${PN} += "/usr/bin/sh \
systemd"

inherit rpm
