SUMMARY = "Plugin for the munin / munin-node monitoring package"
DESCRIPTION = "Unbound is a validating, recursive, and caching DNS(SEC) resolver. \
 \
This package holds the plugin for the munin / munin-node monitoring package"
LICENSE = "BSD-3-Clause"

PV = "1.17.1"

RPM_NAME = "unbound-munin-1.17.1-1.5.noarch.rpm"
RPM_HASH = "0e00f67843a00ca051ce4dca2684e5074e94ed9feda2a7c1b3909092fefc0b496e232089b2186a0ebcbe038fae79b0ad898041bd45e6162fa7243362ccb62733"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-unbound-munin \
unbound-munin"

RDEPENDS:${PN} += "/usr/bin/sh \
bc \
munin-node \
unbound"

inherit rpm
