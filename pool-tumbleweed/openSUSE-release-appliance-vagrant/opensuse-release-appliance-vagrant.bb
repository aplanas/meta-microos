SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230902"

RPM_NAME = "openSUSE-release-appliance-vagrant-20230902-1800.1.aarch64.rpm"
RPM_HASH = "d8ced400cb809bdcee262e5b2c0fac0fac6a551db7f4e31b07545d00c0aa01baeb29797fc916b8b71fc42846adc207fd6f81dcc42c96ad95841bbb6926e13b2e"

RPROVIDES:${PN} += "flavor-appliance-vagrant \
openSUSE-release-appliance-vagrant \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
