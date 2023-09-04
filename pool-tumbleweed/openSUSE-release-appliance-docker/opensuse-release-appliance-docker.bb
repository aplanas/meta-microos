SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230828"

RPM_NAME = "openSUSE-release-appliance-docker-20230828-1789.1.aarch64.rpm"
RPM_HASH = "5f6fceda0d2156e095c812ff9978b64f694a78aff10f0d0b96a6e1016bdf54a82ba1731416b14f5f17970317f7e568395c02d1e1529ecdc9d6106d3dc928b521"

RPROVIDES:${PN} += "flavor-appliance-docker \
openSUSE-release-appliance-docker \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
