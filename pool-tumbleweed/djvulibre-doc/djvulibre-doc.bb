SUMMARY = "Documentation for djvulibre"
DESCRIPTION = "DjVuLibre is an implementation of DjVu, a Web-centric format and \
software platform for distributing documents and images. \
 \
This package contains the documentation."
LICENSE = "GPL-2.0-or-later"

PV = "3.5.28"

RPM_NAME = "djvulibre-doc-3.5.28-6.1.noarch.rpm"
RPM_HASH = "038000c54419f688bb08f6bbec138839c9b531b47d20569adf7afeaa1245ab768b02d9f4914dbbc2141009327acb2e6ab10a80b1031b6b7540cff0112c6dcc7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "djvulibre-doc"

RDEPENDS:${PN} += ""

inherit rpm
