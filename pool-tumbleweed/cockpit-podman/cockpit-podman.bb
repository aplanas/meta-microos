SUMMARY = "Cockpit component for Podman containers"
DESCRIPTION = "Cockpit component for managing Podman containers"
LICENSE = "LGPL-2.1-or-later"

PV = "53"

RPM_NAME = "cockpit-podman-53-1.3.noarch.rpm"
RPM_HASH = "73b6ac6a8b072279c9a468c898564ac442b8202eb80d28bf506d11e94b2f01fb516c3782d33f569f81b5e2ba26e4fe4bd437ed65b5ac7aec6ce4a6f63077f4b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-podman"

RDEPENDS:${PN} += "cockpit-bridge \
cockpit-shell \
podman"

inherit rpm
