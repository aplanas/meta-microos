SUMMARY = "Documentation files for the gfbgraph package"
DESCRIPTION = "A GObject library for Facebook Graph API. This package contains the \
documentation files for the gfbgraph package"
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.5"

RPM_NAME = "gfbgraph-doc-0.2.5-1.9.noarch.rpm"
RPM_HASH = "fc2a9085f3d0e5250b993d53d97259d4e642249ba5551728ca1ce321855f584225557c1aeb3beeb673e6a286fc1d85c72cd1eb3cc651ddb53f48136a21b66b2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gfbgraph-doc"

RDEPENDS:${PN} += ""

inherit rpm
