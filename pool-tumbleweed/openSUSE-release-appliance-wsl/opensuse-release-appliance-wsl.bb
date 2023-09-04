SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230828"

RPM_NAME = "openSUSE-release-appliance-wsl-20230828-1789.1.aarch64.rpm"
RPM_HASH = "ade4e9913ae4bbbcb17449368268ea3ee1658c68656073bc282a93aacdf2a7912449730ad9562c25618e7a7920b2a3ff4d7f8679b4f6f45ffa322d117c1f75a6"

RPROVIDES:${PN} += "flavor-appliance-wsl \
openSUSE-release-appliance-wsl \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
