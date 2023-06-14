SUMMARY = "Command line module player"
DESCRIPTION = "This package contains the openmpt123 command-line module player."
LICENSE = "BSD-3-Clause"

PV = "0.6.10"

RPM_NAME = "openmpt123-0.6.10-1.1.aarch64.rpm"
RPM_HASH = "c0036c2f82dfbb0190894f4aa357160006fee95c66aee731bb829224b1e9f576895a854e63dbc6ffe4185d43e74c10db6d477f06fb04d8320f60d436148f25da"

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
