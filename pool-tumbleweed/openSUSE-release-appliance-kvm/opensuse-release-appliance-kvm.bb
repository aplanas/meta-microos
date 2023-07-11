SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230707"

RPM_NAME = "openSUSE-release-appliance-kvm-20230707-1726.1.aarch64.rpm"
RPM_HASH = "c726edbf06a18a1faf8eb5f067d11ccf74b1504e202ac00896ff5130a0af3c76ab310a5b45ca6c198b9563ad07d6252041f161d1ae5292b083c954d1b11acfe2"

RPROVIDES:${PN} += "flavor-appliance-kvm \
openSUSE-release-appliance-kvm \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
