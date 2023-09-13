SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230910"

RPM_NAME = "openSUSE-release-ftp-20230910-1810.1.aarch64.rpm"
RPM_HASH = "a5318aa3e7c6e65d5cb599431b2ab3d2805469b8098e51e7925386e19c52a5acd8b90662e52b18e316249847980f7e39a92dd87536a5fa4301ba2d090b2312f3"

RPROVIDES:${PN} += "flavor-ftp \
openSUSE-release-ftp \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
