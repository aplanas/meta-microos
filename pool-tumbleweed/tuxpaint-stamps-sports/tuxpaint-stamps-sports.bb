SUMMARY = "Sports stamps collection for Tux Paint"
DESCRIPTION = "tuxpaint-stamps-sports package contains a set of 'Rubber Stamp' images \
which can be used with the 'Stamp' tool within Tux Paint."
LICENSE = "GPL-2.0-or-later"

PV = "2021.11.25"

RPM_NAME = "tuxpaint-stamps-sports-2021.11.25-1.5.noarch.rpm"
RPM_HASH = "7f6827fa840d38ae382a44fa61b4d62b9a772deb5efdfad5ad83510baa8ba3c8ac3214fc4c2a77b56eefd55d9376de59dd2e25f3b5d42972db986b882abc520b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuxpaint-stamps-category \
tuxpaint-stamps-sports"

RDEPENDS:${PN} += "tuxpaint-stamps"

inherit rpm
