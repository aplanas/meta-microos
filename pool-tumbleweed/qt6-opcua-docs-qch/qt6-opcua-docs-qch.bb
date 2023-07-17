SUMMARY = "Documentation for qt6-opcua in QCH format"
DESCRIPTION = "This package contains documentation for qt6-opcua in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-opcua-docs-qch-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "e71adfe20d04fe7a1044aa431ac4fb191aafd1ea749b5cca6b36f2b604d739c7004fb12d3f346bf01453317237af2f5f75a79beed1e30ba831bd7923899e5cf7"

RPROVIDES:${PN} += "qt6-opcua-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
