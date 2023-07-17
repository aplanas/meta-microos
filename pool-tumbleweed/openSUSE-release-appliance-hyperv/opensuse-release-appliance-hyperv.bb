SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230712"

RPM_NAME = "openSUSE-release-appliance-hyperv-20230712-1733.1.aarch64.rpm"
RPM_HASH = "cc39fad1cd194b44f8478437faa73baa9e763b4f7ca7d206cea224dcefd714445348eb31b5027109535b51c85e1c0518b5588c15947737fe380ea1baf6a2dcef"

RPROVIDES:${PN} += "flavor-appliance-hyperv \
openSUSE-release-appliance-hyperv \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
