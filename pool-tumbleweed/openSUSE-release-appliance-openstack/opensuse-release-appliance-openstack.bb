SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230707"

RPM_NAME = "openSUSE-release-appliance-openstack-20230707-1726.1.aarch64.rpm"
RPM_HASH = "9d2618141b7700c22215d6d547bdd38df4abfb3eeab65d58c654d96a7bb50f56f7b43c1a337cf61ca80e6bdd172b8b84e700ea4362f70bd39e0e89c187ffa97e"

RPROVIDES:${PN} += "flavor-appliance-openstack \
openSUSE-release-appliance-openstack \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
