SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230719"

RPM_NAME = "openSUSE-release-appliance-docker-20230719-1742.1.aarch64.rpm"
RPM_HASH = "55f3aa717fcf26fee4cc9fbc9d678e20d3c2b11ff2f995b163e195f66698d8a23cf8d2019ad0b84664e9a35e3a5fa0611b8935720bef34cd61a3b6526b58fa39"

RPROVIDES:${PN} += "flavor-appliance-docker \
openSUSE-release-appliance-docker \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
