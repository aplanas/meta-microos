SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230802"

RPM_NAME = "openSUSE-release-appliance-vmware-20230802-1758.1.aarch64.rpm"
RPM_HASH = "85be5c5956e7dd3946608539b7d2c764154f4d4a503e857425e54eeca187ded37015b1a7acb327330dbc546de56dd3218a51f2bbd754efacf160dae42085d1d4"

RPROVIDES:${PN} += "flavor-appliance-vmware \
openSUSE-release-appliance-vmware \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
