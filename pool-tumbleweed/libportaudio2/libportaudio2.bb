SUMMARY = "Portable Real-Time Audio Library"
DESCRIPTION = "PortAudio is a portable audio I/O library designed for cross-platform \
support of audio. It uses a callback mechanism to request audio \
processing. Audio can be generated in various formats, including 32 bit \
floating point, and will be converted to the native format internally."
LICENSE = "MIT"

PV = "190700_20210406"

RPM_NAME = "libportaudio2-190700_20210406-1.9.aarch64.rpm"
RPM_HASH = "485a68a47335ceb379b70648b08e6b5ebcde7375aabafc6b86504881499dad8a8de076fe1d05c557cf1edc5d81c6a3104b0720d9426b127c58bb0ddf3e8e0d2c"

RPROVIDES:${PN} += "libportaudio.so.2 \
libportaudio2 \
portaudio"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libjack.so.0 \
libm.so.6"

inherit rpm
