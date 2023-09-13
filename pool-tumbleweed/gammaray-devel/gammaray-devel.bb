SUMMARY = "Introspection/Debugging Tool for Qt Applications"
DESCRIPTION = "Gamma Ray is a comprehensive collection of high level introspection \
and debugging utilities specifically tailored for the various \
frameworks in Qt. Development files."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.0"

RPM_NAME = "gammaray-devel-3.0.0-1.1.aarch64.rpm"
RPM_HASH = "98bc1dbe336c1188f3962868092bc72c9c739fba1cfb03e664d6f43bf1fec237be01ae1e19b22bde1310f0f1761b1894995987fa1344564d3c7eab8432a3c3c9"

RPROVIDES:${PN} += "cmake-GammaRay \
gammaray-devel"

RDEPENDS:${PN} += "libgammaray-3-0-0 \
libgammaray-shared-3-0-0"

inherit rpm
