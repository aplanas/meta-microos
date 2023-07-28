SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230719"

RPM_NAME = "openSUSE-release-appliance-kvm-20230719-1742.1.aarch64.rpm"
RPM_HASH = "f46fc36dc24a3459061f9da337b71f993587f910f834f29a5069e31b1d667231bc79d126c068d98fd0b6c20b075cfff8e3412db6a2fc92c65e46156e25262b3d"

RPROVIDES:${PN} += "flavor-appliance-kvm \
openSUSE-release-appliance-kvm \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
