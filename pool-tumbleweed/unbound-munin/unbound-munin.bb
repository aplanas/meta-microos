SUMMARY = "Plugin for the munin / munin-node monitoring package"
DESCRIPTION = "Unbound is a validating, recursive, and caching DNS(SEC) resolver. \
 \
This package holds the plugin for the munin / munin-node monitoring package"
LICENSE = "BSD-3-Clause"

PV = "1.18.0"

RPM_NAME = "unbound-munin-1.18.0-1.1.noarch.rpm"
RPM_HASH = "08d52d1aed2f2e8e240f00c7149e25703c1578563c81365e87c15e47ae27805c4cf414f9991476dd5624770be48a491aaefb158e348bc11d1d8f1324028b2f0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-unbound-munin \
unbound-munin"

RDEPENDS:${PN} += "/usr/bin/sh \
bc \
munin-node \
unbound"

inherit rpm
