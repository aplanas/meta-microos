SUMMARY = "An API for audio analysis and feature extraction plugins"
DESCRIPTION = "Vamp is an API for C and C++ plugins that process sampled audio data \
to produce descriptive output (measurements or semantic observations)."
LICENSE = "MIT"

PV = "2.10.0"

RPM_NAME = "vamp-plugin-sdk-2.10.0-1.12.aarch64.rpm"
RPM_HASH = "a5b490c9dbb470b456c73ba35730ac64d3c0484f71c3a79f4f541441803d554912b644bce63e7275992e059d8aad0148256dca52b83fa874a2747e37deeb1d6f"

RPROVIDES:${PN} += "vamp-plugin-sdk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libsndfile.so.1 \
libstdc++.so.6"

inherit rpm
