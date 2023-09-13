SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230910"

RPM_NAME = "openSUSE-release-appliance-hyperv-20230910-1810.1.aarch64.rpm"
RPM_HASH = "1ab5c51c8927c129968c364808e72b0f81b27318ad5d5c50c4dfb509947ae8fe5158eeb69ed177288bffb20d2a79f994a3327a832f377e324891a5a0ad132702"

RPROVIDES:${PN} += "flavor-appliance-hyperv \
openSUSE-release-appliance-hyperv \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
