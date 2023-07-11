SUMMARY = "An API for audio analysis and feature extraction plugins"
DESCRIPTION = "Vamp is an API for C and C++ plugins that process sampled audio data \
to produce descriptive output (measurements or semantic observations)."
LICENSE = "MIT"

PV = "2.10.0"

RPM_NAME = "vamp-plugin-sdk-2.10.0-1.13.aarch64.rpm"
RPM_HASH = "f85f66393d84124f803141f0016dbd34addef1968c9da54ec233b8c4c206330fb34b989e109bdf1d4ea53ef821f4be4a0cb7f9ea6302a3950030b39ec964c45e"

RPROVIDES:${PN} += "vamp-plugin-sdk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libsndfile.so.1 \
libstdc++.so.6"

inherit rpm
