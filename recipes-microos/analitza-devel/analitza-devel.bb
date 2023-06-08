SUMMARY = "Development files for analitza, a mathematical feature library"
DESCRIPTION = "Development files for Analitza. The Analitza library lets developers \
add mathematical features to programs."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "analitza-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "91086c4d98c424e93e0b8852526e02d7eef2a64cfd2a9e5655ccf12de106428d1fda1bc2e1f255964cc39afc9d370b601eb31d49df81318339cd65bf96f1e74d"

RPROVIDES:${PN} += "analitza-devel analitza-devel(aarch-64) cmake(Analitza5)"
RDEPENDS:${PN} += "libAnalitza8"

inherit rpm
