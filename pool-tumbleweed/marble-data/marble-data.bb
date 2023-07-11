SUMMARY = "Generic map viewer: data"
DESCRIPTION = "Marble is a viewer of map data. This package contains its data."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "marble-data-23.04.3-1.1.noarch.rpm"
RPM_HASH = "c8295ae2925a6a1a2663183f5f8b4308d4334446923e21722cb6881165702573ce3071f4ac5769386cb8e303412dab94b6d8a7696644cc1b0cca15a289b7efc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "marble-data \
marble5-data"

RDEPENDS:${PN} += "marble"

inherit rpm
