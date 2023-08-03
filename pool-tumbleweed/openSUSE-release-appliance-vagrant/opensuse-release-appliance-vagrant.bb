SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230801"

RPM_NAME = "openSUSE-release-appliance-vagrant-20230801-1756.1.aarch64.rpm"
RPM_HASH = "2c70a6bd737de9fdd7c26406700ab4867323aaaff46a4a27bb044230fde03d2119a70786c6c9e474260bebd0e544f8303e66186322969b478b63ca4daf25efec"

RPROVIDES:${PN} += "flavor-appliance-vagrant \
openSUSE-release-appliance-vagrant \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
