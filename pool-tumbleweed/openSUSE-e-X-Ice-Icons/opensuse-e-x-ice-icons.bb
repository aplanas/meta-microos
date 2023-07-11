SUMMARY = "FDO Icon theme to go with openSUSE Enlightenment Theme"
DESCRIPTION = "An FDO Icon theme that matches the one used by the openSUSE Enlightenment \
Ice theme"
LICENSE = "GPL-3.0-only"

PV = "20220219.1.26"

RPM_NAME = "openSUSE-e-X-Ice-Icons-20220219.1.26-1.12.noarch.rpm"
RPM_HASH = "0756e58ea6c26f94b0e8ad3edb73e6a559ff2534918ef0252ac6c2c87c7b462c11a80540349a705bf71f64c8eb1e31f478a306d90771e770ea8eb5b0d837803d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openSUSE-e-X-Ice-Icons"

RDEPENDS:${PN} += ""

inherit rpm
