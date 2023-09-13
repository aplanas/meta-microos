SUMMARY = "ProTracker 2 clone"
DESCRIPTION = "Multi-platform clone of the classic music making software \
ProTracker 2.3D."
LICENSE = "BSD-3-Clause & CC-BY-NC-SA-4.0"

PV = "1.64"

RPM_NAME = "pt2-clone-1.64-1.1.aarch64.rpm"
RPM_HASH = "f111af605c83ae73e6b20a896abac751eaf048739be98da5314ca0a569028e6a8e55971704d56c12ee9123146b63115f132db6d12ba94e29780e46b6a3403343"

RPROVIDES:${PN} += "pt2-clone"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libm.so.6"

inherit rpm
