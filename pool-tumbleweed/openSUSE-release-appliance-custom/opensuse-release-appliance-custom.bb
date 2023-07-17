SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230712"

RPM_NAME = "openSUSE-release-appliance-custom-20230712-1733.1.aarch64.rpm"
RPM_HASH = "dcb76fade75041b908d0dcd728efd35eb52049c02135948d950c7a6f95a01b545ad2ef9d47353034a055707b5701468094f738e09663c9909854164e57f0d14c"

RPROVIDES:${PN} += "flavor-appliance-custom \
openSUSE-release-appliance-custom \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
