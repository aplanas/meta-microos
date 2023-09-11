SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230904"

RPM_NAME = "openSUSE-release-appliance-custom-20230904-1803.1.aarch64.rpm"
RPM_HASH = "b32b40412c2429a48facacca2786b0896d7e4946f13a0d051e974df692e53dbfd494b7a38b004920a9ead8042e31710739b67ab1fc3cca78626af45f36297bf3"

RPROVIDES:${PN} += "flavor-appliance-custom \
openSUSE-release-appliance-custom \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
