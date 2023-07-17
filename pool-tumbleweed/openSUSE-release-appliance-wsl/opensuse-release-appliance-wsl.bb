SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230712"

RPM_NAME = "openSUSE-release-appliance-wsl-20230712-1733.1.aarch64.rpm"
RPM_HASH = "4849de8b2309e44de2e824c29138ee6acda7d54917ce6240306068f223b16f7c79df5f3aca5b249f24fd1721609c4200f9a62410e0387df8a80fb44c28514678"

RPROVIDES:${PN} += "flavor-appliance-wsl \
openSUSE-release-appliance-wsl \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
