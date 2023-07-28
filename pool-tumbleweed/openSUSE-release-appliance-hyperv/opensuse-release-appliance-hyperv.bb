SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230719"

RPM_NAME = "openSUSE-release-appliance-hyperv-20230719-1742.1.aarch64.rpm"
RPM_HASH = "71e15319c9eb54635ef77c0867a3140d24e270aa6f4ba9cb746352a47602fe5bcfd28e987b92f98a303c33d1529b718c869141c65071226b09d1331397ff0b81"

RPROVIDES:${PN} += "flavor-appliance-hyperv \
openSUSE-release-appliance-hyperv \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
