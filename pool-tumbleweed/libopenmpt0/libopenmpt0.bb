SUMMARY = "Library to operate with module formats using the openmpt API"
DESCRIPTION = "libopenmpt is a C++ and C library to decode tracker music files \
(modules) into a PCM audio stream. It is based on the player code of \
the OpenMPT project, a descendant of the original ModPlug Tracker."
LICENSE = "BSD-3-Clause"

PV = "0.7.2"

RPM_NAME = "libopenmpt0-0.7.2-1.1.aarch64.rpm"
RPM_HASH = "dc8a541b9a501ec0926e091eaddf40d5b07d48b0b648350713b63d3b9ecd0ee90d86c63b33f2c092724029587bbfe8ee034683ba0590b1dc92d55c6e8612a482"

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
