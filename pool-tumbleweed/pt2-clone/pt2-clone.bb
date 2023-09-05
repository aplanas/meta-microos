SUMMARY = "ProTracker 2 clone"
DESCRIPTION = "Multi-platform clone of the classic music making software \
ProTracker 2.3D."
LICENSE = "BSD-3-Clause & CC-BY-NC-SA-4.0"

PV = "1.62"

RPM_NAME = "pt2-clone-1.62-1.1.aarch64.rpm"
RPM_HASH = "0facbb28173cf6d8ed1762f1437b6f699f0bbfba4eab2444c07ee921a5c8942add7fd08c79c843df973b96d10311032859e5dc961491f3e986c979879647a392"

RPROVIDES:${PN} += "pt2-clone"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libm.so.6"

inherit rpm
