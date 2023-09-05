SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230902"

RPM_NAME = "openSUSE-release-appliance-hyperv-20230902-1800.1.aarch64.rpm"
RPM_HASH = "1c8b4ea2d215945db70e8988fce69d5d50489281e1aeb5804eb8e7a92f2f31380bc5d883f3ba699ab64a3e4c1d46858738990491342818e09993728be0f384a3"

RPROVIDES:${PN} += "flavor-appliance-hyperv \
openSUSE-release-appliance-hyperv \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
