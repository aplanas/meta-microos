SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230910"

RPM_NAME = "openSUSE-release-appliance-openstack-20230910-1810.1.aarch64.rpm"
RPM_HASH = "acbd26ed915e79f8473f2d159fd9f17a678b2c0e9011058606ae3f7c97576c201c972a67f60f9aab661fea7637fbef99778325a1d56321defb09eaafb6be8b41"

RPROVIDES:${PN} += "flavor-appliance-openstack \
openSUSE-release-appliance-openstack \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
