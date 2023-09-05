SUMMARY = "Marble documentation"
DESCRIPTION = "Marble is a viewer of map data. This package contains its documentation."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "marble-doc-23.08.0-1.1.noarch.rpm"
RPM_HASH = "d87f619e22aacbb58a81361598af025c5baab93b1a01433d4f65746823d6268040aa0b7a1d15001b2339a0edc802f02e03a2c34c3759b3633fd57a208251801c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "marble-doc \
marble5-doc"

RDEPENDS:${PN} += "marble"

inherit rpm
