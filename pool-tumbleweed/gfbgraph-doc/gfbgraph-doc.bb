SUMMARY = "Documentation files for the gfbgraph package"
DESCRIPTION = "A GObject library for Facebook Graph API. This package contains the \
documentation files for the gfbgraph package"
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.5"

RPM_NAME = "gfbgraph-doc-0.2.5-1.8.noarch.rpm"
RPM_HASH = "cd23956934f984caff685dafc162648e0a40cfdbcdab27b44d45c9281f6a8a6d1db443ae8d4006502dfaf2a396fe92838b1e8ae1c2b4081f42199a9b4a120a72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gfbgraph-doc"

RDEPENDS:${PN} += ""

inherit rpm
