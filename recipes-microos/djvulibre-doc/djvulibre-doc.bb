SUMMARY = "Documentation for djvulibre"
DESCRIPTION = "DjVuLibre is an implementation of DjVu, a Web-centric format and \
software platform for distributing documents and images. \
 \
This package contains the documentation."
LICENSE = "GPL-2.0-or-later"

PV = "3.5.28"

RPM_NAME = "djvulibre-doc-3.5.28-4.6.noarch.rpm"
RPM_HASH = "4f9d4cbaf4e1f9cf831108203b019475311fcc96cb064b36b0cf545852c5a6935ffb703be0a71b9995ab06c93a44e363519198de91e295baf3a4f43d08033e47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "djvulibre-doc"
RDEPENDS:${PN} += ""

inherit rpm
