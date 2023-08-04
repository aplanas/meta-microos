SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230802"

RPM_NAME = "openSUSE-release-appliance-kvm-20230802-1758.1.aarch64.rpm"
RPM_HASH = "03bb586f3488e879f3fcb3234ad79517fbb64cc130afd8a2c391426a0b6e316c510469a94352c3bf3afd7256fa51b9cb47109da556504f4dc62e6c5a493ccabf"

RPROVIDES:${PN} += "flavor-appliance-kvm \
openSUSE-release-appliance-kvm \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
