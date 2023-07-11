SUMMARY = "Command line module player"
DESCRIPTION = "This package contains the openmpt123 command-line module player."
LICENSE = "BSD-3-Clause"

PV = "0.7.2"

RPM_NAME = "openmpt123-0.7.2-1.1.aarch64.rpm"
RPM_HASH = "ee3546623672ecda0d491ee81d53047e6f5e8a36432e3679de75e2a60b5c0c77d3b8b951331377cbb1fcc2e12efd328f1b371140a260ac2292bdfd8267a20e33"

RPROVIDES:${PN} += "openmpt123"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libFLAC.so.12 \
libSDL2-2.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopenmpt.so.0 \
libportaudio.so.2 \
libpulse-simple.so.0 \
libpulse.so.0 \
libsndfile.so.1 \
libstdc++.so.6"

inherit rpm
