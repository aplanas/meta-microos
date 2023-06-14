SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230604"

RPM_NAME = "openSUSE-release-appliance-docker-20230604-1684.1.aarch64.rpm"
RPM_HASH = "09c5084693ea56125e4f33a110f465ea4a06434a9fb95810da710c84505e610c88f93871285e58956861e2169dd02df9dbc4477a149d2ba8eec24c157e519c3e"

RPROVIDES:${PN} += "flavor-appliance-docker \
openSUSE-release-appliance-docker \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
