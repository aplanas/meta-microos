SUMMARY = "Plugin for the munin / munin-node monitoring package"
DESCRIPTION = "Unbound is a validating, recursive, and caching DNS(SEC) resolver. \
 \
This package holds the plugin for the munin / munin-node monitoring package"
LICENSE = "BSD-3-Clause"

PV = "1.17.1"

RPM_NAME = "unbound-munin-1.17.1-2.1.noarch.rpm"
RPM_HASH = "21709eef1583f8ae79381eb1f78bfee02732d5e3f940af7e203916d960777e72a4c68af1d9bef96e1ab0d6ff22815ff3e959448903796ad3c7c1d61c8c30025c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-unbound-munin \
unbound-munin"

RDEPENDS:${PN} += "/usr/bin/sh \
bc \
munin-node \
unbound"

inherit rpm
