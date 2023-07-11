SUMMARY = "A Library to Handle Various Audio File Formats"
DESCRIPTION = "Libsndfile is a C library for reading and writing sound files, such \
as AIFF, AU, and WAV files, through one standard interface. It can \
currently read and write 8, 16, 24, and 32-bit PCM files as well as \
32-bit floating point WAV files and a number of compressed formats."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.0"

RPM_NAME = "libsndfile1-1.2.0-2.2.aarch64.rpm"
RPM_HASH = "098de59021ce23fc8b86a8ce477ebc6a89509d88eef857c5fbbd93666155277f131d5bbaebad1b7220fe72c7c27d80488fe788d5422738659d98c7021082e707"

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
