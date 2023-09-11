SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230904"

RPM_NAME = "openSUSE-release-appliance-wsl-20230904-1803.1.aarch64.rpm"
RPM_HASH = "942badc88726df1f7790c089b3be7b9660eb3f70f5bea39d8aab84ae2774bddb90616d665be019d4f0ade1a0a3f84b5c68a963c300d3484d2c528f2e93c607f8"

RPROVIDES:${PN} += "flavor-appliance-wsl \
openSUSE-release-appliance-wsl \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
