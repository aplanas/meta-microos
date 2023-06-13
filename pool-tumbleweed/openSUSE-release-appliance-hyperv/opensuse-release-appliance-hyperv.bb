SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230604"

RPM_NAME = "openSUSE-release-appliance-hyperv-20230604-1684.1.aarch64.rpm"
RPM_HASH = "b530fe159c1a5c8f0679b9a61043ada1d01d9bea7d6df5ea530babf9513283b533810f810a2a151c1a2962441bed20ef9f14b552f6bc67158fecbaa851511070"

RPROVIDES:${PN} += "flavor(appliance-hyperv) \
openSUSE-release-appliance-hyperv \
openSUSE-release-appliance-hyperv(aarch-64) \
product_flavor() \
product_flavor(openSUSE)"

RDEPENDS:${PN} += ""

inherit rpm
