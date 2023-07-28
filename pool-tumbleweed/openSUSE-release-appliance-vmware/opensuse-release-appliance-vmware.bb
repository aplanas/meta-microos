SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230719"

RPM_NAME = "openSUSE-release-appliance-vmware-20230719-1742.1.aarch64.rpm"
RPM_HASH = "f1012c79eb7794d3bbbc497c844434a5949c376ec3b4bfdf1cbc354c05743f79871f970e234150bf1c3624f69e58fc87f0cacaed25296ad5b06e4f701c669455"

RPROVIDES:${PN} += "flavor-appliance-vmware \
openSUSE-release-appliance-vmware \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
