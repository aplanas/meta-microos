SUMMARY = "Alternative but compatible interface to modules that export symbols"
DESCRIPTION = "This module acts as a layer between Exporter and modules which consume \
exports. It is feature-compatible with Exporter, plus some much needed \
extras. You can use this to import symbols from any exporter that follows \
Exporters specification. The exporter modules themselves do not need to use \
or inherit from the Exporter module, they just need to set '@EXPORT' and/or \
other variables."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.026"

RPM_NAME = "perl-Importer-0.026-1.14.noarch.rpm"
RPM_HASH = "772fbaa6d496f47673da6c0a63c04762bf85de04f23e04fc085be0a8781ab6cfa511067776dc219ab483895925fab03305b5b3cd25888c5f1302aad10a959023"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Importer"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
