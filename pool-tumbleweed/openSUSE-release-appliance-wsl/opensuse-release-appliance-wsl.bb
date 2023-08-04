SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230802"

RPM_NAME = "openSUSE-release-appliance-wsl-20230802-1758.1.aarch64.rpm"
RPM_HASH = "02215d869f5fe484025f731b006cc7c8ccf256dea9233af16c1d213c07ab93398913ca996e5fceb198f1a387e4efd7975eb23bb26eb589b14d912c940a19a321"

RPROVIDES:${PN} += "flavor-appliance-wsl \
openSUSE-release-appliance-wsl \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
