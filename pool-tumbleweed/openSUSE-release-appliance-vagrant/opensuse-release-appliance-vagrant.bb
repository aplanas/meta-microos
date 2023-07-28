SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230719"

RPM_NAME = "openSUSE-release-appliance-vagrant-20230719-1742.1.aarch64.rpm"
RPM_HASH = "3e93699f156fb3f6f3e779ea59a1285ac2f89257dfdae914bda37efedfa66fd9ea2ac57ef5045cca578999f60de4237fce05cf34a0960a230bd6286fb7b2032a"

RPROVIDES:${PN} += "flavor-appliance-vagrant \
openSUSE-release-appliance-vagrant \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
