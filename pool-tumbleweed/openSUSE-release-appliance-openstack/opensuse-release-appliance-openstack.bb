SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230801"

RPM_NAME = "openSUSE-release-appliance-openstack-20230801-1756.1.aarch64.rpm"
RPM_HASH = "aca53efef5259caaa20b637f72398b9f30686d62d368330d7c1e923c633b4854b7feaf6e99c02dfa839ed05062c0686a75b7797599ae8d01cb59d9e6b17a72c7"

RPROVIDES:${PN} += "flavor-appliance-openstack \
openSUSE-release-appliance-openstack \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
