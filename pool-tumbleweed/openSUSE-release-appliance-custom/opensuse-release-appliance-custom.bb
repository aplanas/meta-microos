SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230902"

RPM_NAME = "openSUSE-release-appliance-custom-20230902-1800.1.aarch64.rpm"
RPM_HASH = "64c6af619e6f194e92462f3d3ef2c051aac9c9ac950c17a4d7a493f221fdfa7b7aa5ccda0e6eacd13d1a1f817c1a46855ac5993a4d9d67ee62953e3072c180f8"

RPROVIDES:${PN} += "flavor-appliance-custom \
openSUSE-release-appliance-custom \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
