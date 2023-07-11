SUMMARY = "Development files for analitza, a mathematical feature library"
DESCRIPTION = "Development files for Analitza. The Analitza library lets developers \
add mathematical features to programs."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "analitza-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "f6fe877a9baef88770f6d52e38e7c799ad23c9c5a56dd2cc1de11e67237888811deb87c43b490fcabb5c5786a0dbe42a32ce307536facdfdbc3e2fc7e333f69a"

RPROVIDES:${PN} += "analitza-devel \
cmake-Analitza5"

RDEPENDS:${PN} += "libAnalitza8"

inherit rpm
