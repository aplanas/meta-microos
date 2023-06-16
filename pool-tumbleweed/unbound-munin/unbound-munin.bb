SUMMARY = "Plugin for the munin / munin-node monitoring package"
DESCRIPTION = "Unbound is a validating, recursive, and caching DNS(SEC) resolver. \
 \
This package holds the plugin for the munin / munin-node monitoring package"
LICENSE = "BSD-3-Clause"

PV = "1.17.1"

RPM_NAME = "unbound-munin-1.17.1-1.3.noarch.rpm"
RPM_HASH = "fbceb967106c6df272dfeac17b126b0a0db61e74c534a734f9ea4d39134dee4d27f17615f1540e62f5b423bb2594dbfdd59adc97d8e53207aef7fa5d2beb55ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-unbound-munin \
unbound-munin"

RDEPENDS:${PN} += "/usr/bin/sh \
bc \
munin-node \
unbound"

inherit rpm
