SUMMARY = "Introspection/Debugging Tool for Qt Applications"
DESCRIPTION = "Gamma Ray is a comprehensive collection of high level introspection \
and debugging utilities specifically tailored for the various \
frameworks in Qt. Development files."
LICENSE = "GPL-2.0-or-later"

PV = "2.11.3"

RPM_NAME = "gammaray-devel-2.11.3-2.16.aarch64.rpm"
RPM_HASH = "483b44e5e6438ccfa052e8c9e590de538984917d0d58c7c56dec8bd3440f4bf37ea3451a779d4ecac171c0aef2f770cf40636155cc4ad4fca285d206419851e8"

RPROVIDES:${PN} += "cmake-GammaRay \
gammaray-devel"

RDEPENDS:${PN} += "gammaray"

inherit rpm
