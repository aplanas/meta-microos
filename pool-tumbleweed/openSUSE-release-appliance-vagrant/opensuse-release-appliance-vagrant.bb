SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230716"

RPM_NAME = "openSUSE-release-appliance-vagrant-20230716-1738.1.aarch64.rpm"
RPM_HASH = "f6be68d9337f872b98f5b7e18229e2d6f2daa97019aaf29e1955ff7ab6f070e188e0cf02c476b74f740fdbf3ea6046ffa7a40f0a01252cc434d1b01e0e379076"

RPROVIDES:${PN} += "flavor-appliance-vagrant \
openSUSE-release-appliance-vagrant \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
