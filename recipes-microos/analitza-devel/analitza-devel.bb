SUMMARY = "Development files for analitza, a mathematical feature library"
DESCRIPTION = "Development files for Analitza. The Analitza library lets developers \
add mathematical features to programs."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "analitza-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "ecd385bd178c35d042bcc48f811a646f5e046debabe358c95c431d7844971a1a5d869e6e0fccda17faba5a7b69b6f479f5966e074f3d0d9a7c78633bbe312327"

RPROVIDES:${PN} += "analitza-devel analitza-devel(aarch-64) cmake(Analitza5)"
RDEPENDS:${PN} += "libAnalitza8"

inherit rpm
