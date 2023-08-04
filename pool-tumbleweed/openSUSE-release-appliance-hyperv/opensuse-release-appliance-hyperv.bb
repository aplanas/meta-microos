SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230802"

RPM_NAME = "openSUSE-release-appliance-hyperv-20230802-1758.1.aarch64.rpm"
RPM_HASH = "845496a71f4495196af9307ac1af9368dadd41284fe5ce54d15adde6256f285f8f2376ace1abebaad739bdcf0c24bf896a17efca3d3c4285dccd41ab6c94e5f2"

RPROVIDES:${PN} += "flavor-appliance-hyperv \
openSUSE-release-appliance-hyperv \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
