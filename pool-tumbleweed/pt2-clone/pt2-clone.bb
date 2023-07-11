SUMMARY = "ProTracker 2 clone"
DESCRIPTION = "Multi-platform clone of the classic music making software \
ProTracker 2.3D."
LICENSE = "BSD-3-Clause & CC-BY-NC-SA-4.0"

PV = "1.60"

RPM_NAME = "pt2-clone-1.60-1.1.aarch64.rpm"
RPM_HASH = "0c95bd42d3c7b8ccd6694c140f66fad1a95dcc217ac90b33da00c570ee64c38bc7426c21343ba4ef870d033b75dbe8ae535ba0dafea5b3e284553f92efa95a34"

RPROVIDES:${PN} += "pt2-clone"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libm.so.6"

inherit rpm
