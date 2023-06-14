SUMMARY = "Library to operate with module formats using the openmpt API"
DESCRIPTION = "libopenmpt is a C++ and C library to decode tracker music files \
(modules) into a PCM audio stream. It is based on the player code of \
the OpenMPT project, a descendant of the original ModPlug Tracker."
LICENSE = "BSD-3-Clause"

PV = "0.6.10"

RPM_NAME = "libopenmpt0-0.6.10-1.1.aarch64.rpm"
RPM_HASH = "e71f7936589b54e5ba79a80e9bf3a16f1eece959dac4fc8d9266cbd6cf9223e142f16f082090190554657818614170deec196ae815010c3492a7ff411ebe109a"

RPROVIDES:${PN} += "libopenmpt.so.0 \
libopenmpt0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmpg123.so.0 \
libstdc++.so.6 \
libvorbis.so.0 \
libvorbisfile.so.3 \
libz.so.1"

inherit rpm
