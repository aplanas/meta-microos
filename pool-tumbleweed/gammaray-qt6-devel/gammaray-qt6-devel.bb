SUMMARY = "Introspection/Debugging Tool for Qt Applications"
DESCRIPTION = "Gamma Ray is a comprehensive collection of high level introspection \
and debugging utilities specifically tailored for the various \
frameworks in Qt. Development files."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.0"

RPM_NAME = "gammaray-qt6-devel-3.0.0-1.1.aarch64.rpm"
RPM_HASH = "e77f4f29aad636fe4bf4dc30be081959fa5ab59041906542c59aaafb8fda29242149b052df4f60df22a20d6505ae027ce387ec1554538f38a54d606a23a7e2b8"

RPROVIDES:${PN} += "cmake-GammaRay \
gammaray-qt6-devel"

RDEPENDS:${PN} += "libgammaray-qt6-3-0-0 \
libgammaray-shared-qt6-3-0-0"

inherit rpm
