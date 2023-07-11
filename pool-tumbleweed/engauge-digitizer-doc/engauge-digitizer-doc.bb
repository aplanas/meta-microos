SUMMARY = "Documentation for Engauge Digitizer"
DESCRIPTION = "This package contains the documentation for Engauge Digitizer."
LICENSE = "GPL-2.0-or-later"

PV = "12.1"

RPM_NAME = "engauge-digitizer-doc-12.1-2.5.noarch.rpm"
RPM_HASH = "fce72bf3197157fd53e184a1b839c27c21bce73f972a905f4049f5fead570d0dd8c6ec225d4dcccf084a0729da2e0db713b49a4e3f330ae4a1e18ad5c57a0135"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "engauge-digitizer-doc"

RDEPENDS:${PN} += "engauge-digitizer"

inherit rpm
