SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230902"

RPM_NAME = "openSUSE-release-appliance-kvm-20230902-1800.1.aarch64.rpm"
RPM_HASH = "91844d32ba69646119cced68ae2b95fdbd987424180aeae5adc6abbc7c62911260dee0f94290bf9c3c33de8b12791fdd93233da24c546bceaeb9f07cd1a2cfc1"

RPROVIDES:${PN} += "flavor-appliance-kvm \
openSUSE-release-appliance-kvm \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
