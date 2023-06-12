SUMMARY = "Generic map viewer: data"
DESCRIPTION = "Marble is a viewer of map data. This package contains its data."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "marble-data-23.04.1-1.1.noarch.rpm"
RPM_HASH = "2b753574393bc9be4df5902f6d3a170482fc191f13732ab4546fd4e06db17ae3712e2ad782df7a534727a37f7a4c1da5b7522c2c6c85e7529800ca27b6d55b0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "marble-data \
marble5-data"
RDEPENDS:${PN} += "marble"

inherit rpm
