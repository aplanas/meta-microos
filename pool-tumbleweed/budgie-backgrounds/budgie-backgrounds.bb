SUMMARY = "The default background set for the Budgie Desktop"
DESCRIPTION = "Budgie Backgrounds is the default set of background images for the Budgie Desktop."
LICENSE = "CC0-1.0"

PV = "2.0+0"

RPM_NAME = "budgie-backgrounds-2.0+0-1.1.noarch.rpm"
RPM_HASH = "25a45d04b421e73d13434a3f1a725f62c97f11cd10cbc334c8c75f675c43f8f02c169a92d36c7ee09ccb4d3c94816e38ea5e157a2a41e29dd968754f80c329a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "budgie-backgrounds"

RDEPENDS:${PN} += ""

inherit rpm
