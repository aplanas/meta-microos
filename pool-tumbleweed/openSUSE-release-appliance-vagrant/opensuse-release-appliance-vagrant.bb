SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230828"

RPM_NAME = "openSUSE-release-appliance-vagrant-20230828-1789.1.aarch64.rpm"
RPM_HASH = "c40c15ca1373655dcaaaef19c053764ae1cbad6db2913c05e9bf2364e8831431084033aad1d52ea61ef0e9ed53158d5538febc69266007c45298b57f577a736c"

RPROVIDES:${PN} += "flavor-appliance-vagrant \
openSUSE-release-appliance-vagrant \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
