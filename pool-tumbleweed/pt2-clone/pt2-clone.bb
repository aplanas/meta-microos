SUMMARY = "ProTracker 2 clone"
DESCRIPTION = "Multi-platform clone of the classic music making software \
ProTracker 2.3D."
LICENSE = "BSD-3-Clause & CC-BY-NC-SA-4.0"

PV = "1.61"

RPM_NAME = "pt2-clone-1.61-1.1.aarch64.rpm"
RPM_HASH = "1804c72ac60af3836131b741adaca61bad7318dd25084777dc4ae968aa97237827d650cbd07b1a34f2a6395bcb04f5c2b2df83f1e22e570759cdedaea205f5bc"

RPROVIDES:${PN} += "pt2-clone"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libm.so.6"

inherit rpm
