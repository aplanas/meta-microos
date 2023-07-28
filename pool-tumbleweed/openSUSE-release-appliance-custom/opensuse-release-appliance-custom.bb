SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230719"

RPM_NAME = "openSUSE-release-appliance-custom-20230719-1742.1.aarch64.rpm"
RPM_HASH = "b6f3bf6ae9ef1c252347f252c5104e619ae8a4e12c75da7b659ece0ec6815ee4ab33df489e2a9fbd83162c68aa139161853d0faf6c1bc3b76131bfc70012d507"

RPROVIDES:${PN} += "flavor-appliance-custom \
openSUSE-release-appliance-custom \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
