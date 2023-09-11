SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230904"

RPM_NAME = "openSUSE-release-appliance-kvm-20230904-1803.1.aarch64.rpm"
RPM_HASH = "fa952624c933fa376111364c6658c52645e2bde8a2de4af775f4d0a13d6abb1fe4b0687b6f24a860c19d4e3c08dfdfeaa234403d9250bfbc11bfc8a9af84f0a1"

RPROVIDES:${PN} += "flavor-appliance-kvm \
openSUSE-release-appliance-kvm \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
