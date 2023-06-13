SUMMARY = "The default background set for the Budgie Desktop"
DESCRIPTION = "Budgie Backgrounds is the default set of background images for the Budgie Desktop."
LICENSE = "CC0-1.0"

PV = "1.0+0"

RPM_NAME = "budgie-backgrounds-1.0+0-1.1.noarch.rpm"
RPM_HASH = "c4cfae96a45bfc222480cf8c87e264e3a060fc9b04cf59dcc20a1351fe75fcc3d43ac5ba7736ee18d0a37fd040788dd89284ac17c31f596539b8e944303d7cc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "budgie-backgrounds"

RDEPENDS:${PN} += ""

inherit rpm
