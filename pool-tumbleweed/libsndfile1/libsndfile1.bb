SUMMARY = "A Library to Handle Various Audio File Formats"
DESCRIPTION = "Libsndfile is a C library for reading and writing sound files, such \
as AIFF, AU, and WAV files, through one standard interface. It can \
currently read and write 8, 16, 24, and 32-bit PCM files as well as \
32-bit floating point WAV files and a number of compressed formats."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.0"

RPM_NAME = "libsndfile1-1.2.0-2.1.aarch64.rpm"
RPM_HASH = "a863405fe9b5d6d3b28a8cf5fe810a38e47109869b54ecf8c2b6a53294e12f0be73694d2d4c7fab068e1a5fd1ab40e23cb3d10b84c55e0596d2d710d250b39ba"

RPROVIDES:${PN} += "libsndfile \
libsndfile.so.1 \
libsndfile1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libFLAC.so.12 \
libc.so.6 \
libm.so.6 \
libogg.so.0 \
libopus.so.0 \
libspeex.so.1 \
libvorbis.so.0 \
libvorbisenc.so.2"

inherit rpm
