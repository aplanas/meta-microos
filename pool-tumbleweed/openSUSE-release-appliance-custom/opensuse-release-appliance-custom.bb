SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230707"

RPM_NAME = "openSUSE-release-appliance-custom-20230707-1726.1.aarch64.rpm"
RPM_HASH = "7c3a487f77547075f4d09c5fb8cfeeabb0ed6ad49d655ba8dadf5e1a287058ef9e7f5264d92a93c8bc20c32e4d5e4a9c294d87e6015ea6c1a2535e1b3e362305"

RPROVIDES:${PN} += "flavor-appliance-custom \
openSUSE-release-appliance-custom \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
