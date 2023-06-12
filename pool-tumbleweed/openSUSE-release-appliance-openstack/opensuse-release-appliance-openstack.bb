SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230604"

RPM_NAME = "openSUSE-release-appliance-openstack-20230604-1684.1.aarch64.rpm"
RPM_HASH = "26a61dde41755678108c3551e25133a79c229e54861b815d545b8716ec3917a527080d9a921cb37ea5faca981f3ae4ef1e973c6c8e828a534dac60b3637ca323"

RPROVIDES:${PN} += "flavor(appliance-openstack) \
openSUSE-release-appliance-openstack \
openSUSE-release-appliance-openstack(aarch-64) \
product_flavor() \
product_flavor(openSUSE)"
RDEPENDS:${PN} += ""

inherit rpm
