SUMMARY = "The default background set for the Budgie Desktop"
DESCRIPTION = "Budgie Backgrounds is the default set of background images for the Budgie Desktop."
LICENSE = "CC0-1.0"

PV = "1.0+0"

RPM_NAME = "budgie-backgrounds-1.0+0-1.2.noarch.rpm"
RPM_HASH = "5d25a41f099acb266662d08a26bf902f3402d3b66e4e07ed40b62bff94c62e1cc902c29cc1fd6d83ac1c2d3004f7104a8ec8355e48444a89529105870ebe118b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "budgie-backgrounds"

RDEPENDS:${PN} += ""

inherit rpm
