SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230707"

RPM_NAME = "openSUSE-release-appliance-wsl-20230707-1726.1.aarch64.rpm"
RPM_HASH = "0b4ddd638c7fb87be65b488f660f86715b730e8d8f364ffd1bd5f993ff3df5700c05230c3d9cc5469ced20a16b6ed8fb43056eafc1c4a6652b244f158cafbe79"

RPROVIDES:${PN} += "flavor-appliance-wsl \
openSUSE-release-appliance-wsl \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
