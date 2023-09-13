SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230910"

RPM_NAME = "openSUSE-release-appliance-vagrant-20230910-1810.1.aarch64.rpm"
RPM_HASH = "ad76523f1def01991d4518a8fb1486a0a9cc79ddb7d354ca762f78ad9b89412b7d504d031d17693119b01e8a3d6221a07c306205fa0c04c991aafc5f8f478da7"

RPROVIDES:${PN} += "flavor-appliance-vagrant \
openSUSE-release-appliance-vagrant \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
