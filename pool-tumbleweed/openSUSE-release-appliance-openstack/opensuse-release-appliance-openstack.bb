SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230828"

RPM_NAME = "openSUSE-release-appliance-openstack-20230828-1789.1.aarch64.rpm"
RPM_HASH = "ec3d6a5a11196070a8fa1b0784c7a44dedb790510390a36e38e5a6c8b49fad688154d167cae1139ec232e6dc3c6601d053509c8b01a4f734d02b6b6ae14b4fa2"

RPROVIDES:${PN} += "flavor-appliance-openstack \
openSUSE-release-appliance-openstack \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
