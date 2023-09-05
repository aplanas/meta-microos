SUMMARY = "Development files for analitza, a mathematical feature library"
DESCRIPTION = "Development files for Analitza. The Analitza library lets developers \
add mathematical features to programs."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "analitza-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "65664017758c0fd6eca284b6c391d14fe62100df3ab41b217e7a036751ff95900845e2f5381e6357832824a7733397c8e24e4f426eb1a3e91007712ea925892b"

RPROVIDES:${PN} += "analitza-devel \
cmake-Analitza5"

RDEPENDS:${PN} += "libAnalitza8"

inherit rpm
