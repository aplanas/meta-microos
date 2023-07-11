SUMMARY = "Alternative but compatible interface to modules that export symbols"
DESCRIPTION = "This module acts as a layer between Exporter and modules which consume \
exports. It is feature-compatible with Exporter, plus some much needed \
extras. You can use this to import symbols from any exporter that follows \
Exporters specification. The exporter modules themselves do not need to use \
or inherit from the Exporter module, they just need to set '@EXPORT' and/or \
other variables."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.026"

RPM_NAME = "perl-Importer-0.026-1.13.noarch.rpm"
RPM_HASH = "25b7f19041bb18049893f23912d37e4a95211d3e3344699960e73a34e8dcdeff331c0ba43964b70667725d88a83a815e23b28e1756a9c8375f2bda28e29fa619"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Importer"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
