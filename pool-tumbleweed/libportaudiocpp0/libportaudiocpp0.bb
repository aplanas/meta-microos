SUMMARY = "Portable Real-Time Audio Library"
DESCRIPTION = "PortAudio is a portable audio I/O library designed for cross-platform \
support of audio. It uses a callback mechanism to request audio \
processing. Audio can be generated in various formats, including 32 bit \
floating point, and will be converted to the native format internally."
LICENSE = "MIT"

PV = "190700_20210406"

RPM_NAME = "libportaudiocpp0-190700_20210406-1.9.aarch64.rpm"
RPM_HASH = "8c8322300c9499a6ce13a45883c29e6258eb0a1fe318ee40f031e42bd3c3d9eb057dd6fcdffb5003fd4b01b7559b5a02baa736a5c2afc9182e4f27758817556f"

RPROVIDES:${PN} += "libportaudiocpp.so.0 \
libportaudiocpp0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libportaudio.so.2 \
libstdc++.so.6"

inherit rpm
