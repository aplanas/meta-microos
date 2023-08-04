SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230802"

RPM_NAME = "openSUSE-release-appliance-openstack-20230802-1758.1.aarch64.rpm"
RPM_HASH = "83fa912954f67a4660f0b7c4c0019078cd5775c24547f27bb1bc3bfd3d1601ea332de2c374ba18bd9b13a0d270bc0a11f2b6edf62e180f1b2288fdddc922cd0a"

RPROVIDES:${PN} += "flavor-appliance-openstack \
openSUSE-release-appliance-openstack \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
