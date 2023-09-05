SUMMARY = "Resampler Application written with libzita-resampler"
DESCRIPTION = "zresample copies an audio file, changing the sample rate and/or the \
sample format. For 16-bit output it can also dither the audio signal. \
 \
zretune resamples an audio file by a the inverse of a ratio expressed \
in cents, without changing the nominal sample rate. The result is to \
change the musical pitch and lenght of the file. \
 \
The input for both tools can be any audio file readable by the \
libsndfile library. The output file type is either WAV, WAVEX, CAF, \
AIFF or FLAC."
LICENSE = "GPL-3.0-or-later"

PV = "1.11.2"

RPM_NAME = "zita-resampler-tools-1.11.2-1.1.aarch64.rpm"
RPM_HASH = "5ebbf7808272dc41c9f7c7aa6ced13d4146b3a54af2dbc9cffbf4a39b4bc9cd7e0c02e93df58163ef158d93b8fdbf91c952b99e9d52dfbc36f9d2bfc08785d87"

RPROVIDES:${PN} += "zita-resampler-tools \
zresample \
zretune"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libsndfile.so.1 \
libstdc++.so.6 \
libzita-resampler.so.1"

inherit rpm
