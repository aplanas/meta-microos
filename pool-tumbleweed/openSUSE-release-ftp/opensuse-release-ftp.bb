SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230828"

RPM_NAME = "openSUSE-release-ftp-20230828-1789.1.aarch64.rpm"
RPM_HASH = "593008ec62bcabc5258e5a229d82bda10a2464523d0f634fc23f94718b43ac9a61a2c212f8cdcb93a09f16460ebfa1f4472ea1cf2d462189bdbc11dad0e46c1b"

RPROVIDES:${PN} += "flavor-ftp \
openSUSE-release-ftp \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
