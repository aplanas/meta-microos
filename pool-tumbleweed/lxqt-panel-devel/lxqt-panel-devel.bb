SUMMARY = "Devel files for lxqt-panel"
DESCRIPTION = "LXQt panel development files and headers"
LICENSE = "GPL-2.0-or-later"

PV = "1.3.0"

RPM_NAME = "lxqt-panel-devel-1.3.0-1.2.noarch.rpm"
RPM_HASH = "370b11835c317cca1c2f633086e78014be3d1268da25be40fd6d3120abb31b98b80a802167f231500904035b004ef9df65cf9a20bae5db3a62beaba063e02c32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-panel-devel"

RDEPENDS:${PN} += "lxqt-panel"

inherit rpm
