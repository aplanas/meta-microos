SUMMARY = "Marble documentation"
DESCRIPTION = "Marble is a viewer of map data. This package contains its documentation."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "marble-doc-23.04.1-1.1.noarch.rpm"
RPM_HASH = "c33bfaf9ffbf7d7a244dd51f7c78219f94b215ce5c17e4e7d91c29ec4cf0ab9c70cfac79499c9bb5a5c175916f1fb39ee02f60e9315d0beee3b23bdf96201328"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "marble-doc \
marble5-doc"

RDEPENDS:${PN} += "marble"

inherit rpm
