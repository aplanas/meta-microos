SUMMARY = "Documentation for libtorrent-rasterbar"
DESCRIPTION = "Documentation for the libtorrent-rasterbar package."
LICENSE = "BSD-3-Clause"

PV = "2.0.9"

RPM_NAME = "libtorrent-rasterbar-doc-2.0.9-1.3.noarch.rpm"
RPM_HASH = "024393c52ff0c9e4269f665c4ea446f94c3d5c06cf27f91c04a3627a92ab4af8460fa27cabdb801853a484bfed7dbfc4b53ea0903fdf8a3c7138ceee7543fdad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libtorrent-rasterbar-doc"

RDEPENDS:${PN} += ""

inherit rpm
