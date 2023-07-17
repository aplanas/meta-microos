SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230712"

RPM_NAME = "openSUSE-release-appliance-vmware-20230712-1733.1.aarch64.rpm"
RPM_HASH = "15be92489a2219d8384c9ca2bec59b5cc8cad5f1d7b24a11dbabddea0bd53f5385e2a8493d3a2aad0462f7b1f2fc5640e4dabc0e86dc00ac3c2a78116031559a"

RPROVIDES:${PN} += "flavor-appliance-vmware \
openSUSE-release-appliance-vmware \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
