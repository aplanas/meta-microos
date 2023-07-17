SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230712"

RPM_NAME = "openSUSE-release-appliance-openstack-20230712-1733.1.aarch64.rpm"
RPM_HASH = "279034b38d9a747c11cc98c7ed8e428555c6ce937da33dde87d3e843e3c0b441922542f4052efe5644c5e1cde7486f255afa8cac9b3fac7e62b424be28d3e2ad"

RPROVIDES:${PN} += "flavor-appliance-openstack \
openSUSE-release-appliance-openstack \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
