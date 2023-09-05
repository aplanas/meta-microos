SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230902"

RPM_NAME = "openSUSE-release-appliance-openstack-20230902-1800.1.aarch64.rpm"
RPM_HASH = "b1321c53c1d4cf8d59e128899da20bc750f9ccf34f7a0e2885eb36aad072af07677511c88b36a1771cfe8fbad039708677c1be158a158e7d3ea1e97bb79b404a"

RPROVIDES:${PN} += "flavor-appliance-openstack \
openSUSE-release-appliance-openstack \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
