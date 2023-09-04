SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230828"

RPM_NAME = "openSUSE-release-appliance-hyperv-20230828-1789.1.aarch64.rpm"
RPM_HASH = "94d4bc172e5fe7a011e171fec23c20c368e73aa3ae2a4d78c7324227fc0fc2c894f18e5858fa11f68e5bff51253e44eb7f76a722b83afe2dafd3a2e883f65399"

RPROVIDES:${PN} += "flavor-appliance-hyperv \
openSUSE-release-appliance-hyperv \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
