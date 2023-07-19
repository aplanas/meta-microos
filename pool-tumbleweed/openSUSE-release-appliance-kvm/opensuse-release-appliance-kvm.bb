SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230716"

RPM_NAME = "openSUSE-release-appliance-kvm-20230716-1738.1.aarch64.rpm"
RPM_HASH = "f2676963ae5cea9acc01e76622801b0e785a63d792bb05b777ef59a6763b08a7e5e32b2f1c18664d04b4b6284aaf269d0a6c9a1773051a4aabb56603bff8b731"

RPROVIDES:${PN} += "flavor-appliance-kvm \
openSUSE-release-appliance-kvm \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
