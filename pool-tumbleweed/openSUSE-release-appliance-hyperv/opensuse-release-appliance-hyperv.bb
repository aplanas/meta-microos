SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230904"

RPM_NAME = "openSUSE-release-appliance-hyperv-20230904-1803.1.aarch64.rpm"
RPM_HASH = "1ac6598c40c1d10e7e35590ca84831fdb92087e747e23ed5cfc845e5edbe082095a422a417962404a99d9b527570f394ba2e2b180951c40acb5e795f0a02ac1d"

RPROVIDES:${PN} += "flavor-appliance-hyperv \
openSUSE-release-appliance-hyperv \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
