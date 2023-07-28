SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230719"

RPM_NAME = "openSUSE-release-appliance-openstack-20230719-1742.1.aarch64.rpm"
RPM_HASH = "e0579d4282f1e40fdea414309bb6314f0b7126eb48c72538ee7e7c2f2fa56fe1573df5704dd9450b88a1adf11fd897dd70a404a07164172a26404aae42f97952"

RPROVIDES:${PN} += "flavor-appliance-openstack \
openSUSE-release-appliance-openstack \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
