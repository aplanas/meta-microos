SUMMARY = "Free Lossless Audio Codec"
DESCRIPTION = "FLAC is an audio coding format for lossless compression of digital \
audio, and is also the name of the reference software package that \
includes a codec implementation. Digital audio compressed by FLAC's \
algorithm can typically be reduced to between 50 and 70 percent of \
its original size, and decompresses to an identical copy of the \
original audio data."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & GFDL-1.2-only"

PV = "1.4.3"

RPM_NAME = "flac-1.4.3-1.1.aarch64.rpm"
RPM_HASH = "aff2ec17630eef4139414a94d9680049be1c9c0bc067dc069493f2f87649220b422eae1b0271bdc4c8ebe08f4e6162184294b8e318dee6e4610a57ec0db65485"

RPROVIDES:${PN} += "flac"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libFLAC.so.12 \
libc.so.6 \
libm.so.6"

inherit rpm
