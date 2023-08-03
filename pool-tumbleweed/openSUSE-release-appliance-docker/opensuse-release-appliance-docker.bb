SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230801"

RPM_NAME = "openSUSE-release-appliance-docker-20230801-1756.1.aarch64.rpm"
RPM_HASH = "f2bc041af7a903dfd315c148988a2bec5b4a13baec3bf503d39ddb591df872712fb6b53b3f50e057bf34c931d3a251251418d9664cdf8dfef944c62c4e936be1"

RPROVIDES:${PN} += "flavor-appliance-docker \
openSUSE-release-appliance-docker \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
