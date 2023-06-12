SUMMARY = "Documentation for djvulibre"
DESCRIPTION = "DjVuLibre is an implementation of DjVu, a Web-centric format and \
software platform for distributing documents and images. \
 \
This package contains the documentation."
LICENSE = "GPL-2.0-or-later"

PV = "3.5.28"

RPM_NAME = "djvulibre-doc-3.5.28-5.1.noarch.rpm"
RPM_HASH = "755a641b1996da622080bad28c1dcc94ecb12b8935d91628a32454041f76deaa5f49b2fa571ea00091fa8d814220043632104881b5fda1ea3c1abbbabb2b504f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "djvulibre-doc"
RDEPENDS:${PN} += ""

inherit rpm
