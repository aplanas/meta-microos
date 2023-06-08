SUMMARY = "Introspection/Debugging Tool for Qt Applications"
DESCRIPTION = "Gamma Ray is a comprehensive collection of high level introspection \
and debugging utilities specifically tailored for the various \
frameworks in Qt. Development files."
LICENSE = "GPL-2.0-or-later"

PV = "2.11.3"

RPM_NAME = "gammaray-devel-2.11.3-2.15.aarch64.rpm"
RPM_HASH = "4cf1dcf44e09fe82f3a644e9d04c3b9af8f2d8c4d00e96ad88a0218400af184d2c1251362fb0aea89ee8a50e7a62bccde368e5914a12d6b2b1253579480a30dc"

RPROVIDES:${PN} += "cmake(GammaRay) gammaray-devel gammaray-devel(aarch-64)"
RDEPENDS:${PN} += "gammaray"

inherit rpm
