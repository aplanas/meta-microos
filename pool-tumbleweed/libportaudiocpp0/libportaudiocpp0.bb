SUMMARY = "Portable Real-Time Audio Library"
DESCRIPTION = "PortAudio is a portable audio I/O library designed for cross-platform \
support of audio. It uses a callback mechanism to request audio \
processing. Audio can be generated in various formats, including 32 bit \
floating point, and will be converted to the native format internally."
LICENSE = "MIT"

PV = "190700_20210406"

RPM_NAME = "libportaudiocpp0-190700_20210406-1.8.aarch64.rpm"
RPM_HASH = "d6f02499f96c20851355b844298d570566878c8d37c745ed979aca3fe5c78e7c466fffe4e693baaa13908ac37213723c962b8425ff11766187f044dbf03a00eb"

RPROVIDES:${PN} += "libportaudiocpp.so.0 \
libportaudiocpp0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libportaudio.so.2 \
libstdc++.so.6"

inherit rpm
