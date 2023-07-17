SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230712"

RPM_NAME = "openSUSE-release-appliance-docker-20230712-1733.1.aarch64.rpm"
RPM_HASH = "9b01976f3e0f81a0587646975b8eb544aa2c9c895faa1ccf15623bfd97d487b8a2fb08dd7cfce8f8660c64e7445277bb1a4d965b057f3bc77c53d02b8e65a128"

RPROVIDES:${PN} += "flavor-appliance-docker \
openSUSE-release-appliance-docker \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
