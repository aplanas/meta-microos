SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230716"

RPM_NAME = "openSUSE-release-appliance-docker-20230716-1738.1.aarch64.rpm"
RPM_HASH = "8de6e3b37ba6fafd80cc8b34752205466b898fb6400745b5f3c6441f803cb93e07cce4cb9c551bb1f7bf8007cdd511d2de6fe5b1f884d751e1c2f8e0abac51c5"

RPROVIDES:${PN} += "flavor-appliance-docker \
openSUSE-release-appliance-docker \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
