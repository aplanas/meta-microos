SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230802"

RPM_NAME = "openSUSE-release-appliance-vagrant-20230802-1758.1.aarch64.rpm"
RPM_HASH = "9cd88ac28c680bdd639f7b77a8aab06ca3966ff265c38b727e3ee8bfc99fbe5b2b871db713544cc6f15d89f556aa0259928997b9a2f1d7f3b7c6b034a7180f76"

RPROVIDES:${PN} += "flavor-appliance-vagrant \
openSUSE-release-appliance-vagrant \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
