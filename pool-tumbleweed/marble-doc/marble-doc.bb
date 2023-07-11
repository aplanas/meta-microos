SUMMARY = "Marble documentation"
DESCRIPTION = "Marble is a viewer of map data. This package contains its documentation."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "marble-doc-23.04.3-1.1.noarch.rpm"
RPM_HASH = "205b35e22f187bb50bf044e6d9ee1d31104a966a51f7dbfb7b3b245906baf37a204694bc4ebccf8d0e6bdca3a2ace992313c0f26b1b5114b6f790c61c4397699"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "marble-doc \
marble5-doc"

RDEPENDS:${PN} += "marble"

inherit rpm
