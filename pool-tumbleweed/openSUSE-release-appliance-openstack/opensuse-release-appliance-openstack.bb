SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230904"

RPM_NAME = "openSUSE-release-appliance-openstack-20230904-1803.1.aarch64.rpm"
RPM_HASH = "7fee5848668d9de1412937e9c2f51d136397162ba116aaa133752586aa0c0970786beb8dc39e57d03faa34428959b45600b66e33885a9da0a676edaf4db667fb"

RPROVIDES:${PN} += "flavor-appliance-openstack \
openSUSE-release-appliance-openstack \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
