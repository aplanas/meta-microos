SUMMARY = "Parts collection for LibreCAD"
DESCRIPTION = "Collection of parts for LibreCAD, a Qt application to design 2D \
CAD drawings."
LICENSE = "(Apache-2.0 | SUSE-GPL-3.0+-with-font-exception) & GPL-2.0-only"

PV = "2.2.0"

RPM_NAME = "librecad-parts-2.2.0-1.4.noarch.rpm"
RPM_HASH = "b3c2b7f74587e2d05f3724c871c714dff8adf9255b10997e4f69d792f1c58fc90cb3f74eae8eb384c8a38caf2dae4a71e08004de076e0b0a4416dacb44006a23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "librecad-parts"

RDEPENDS:${PN} += "librecad"

inherit rpm
