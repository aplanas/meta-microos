SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230716"

RPM_NAME = "openSUSE-release-appliance-openstack-20230716-1738.1.aarch64.rpm"
RPM_HASH = "dbd0e99c72a85dcd2fe631e741a3d94af891aaaa0fe9c2e34348799ccae70b13bac56fbe60d06e200888c976538b6b653c32c43d4fc004c12a115783a7c870dd"

RPROVIDES:${PN} += "flavor-appliance-openstack \
openSUSE-release-appliance-openstack \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
