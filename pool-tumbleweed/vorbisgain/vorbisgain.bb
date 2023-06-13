SUMMARY = "Replay Gain calculator for Ogg Vorbis files"
DESCRIPTION = "VorbisGain is a utility that uses a psychoacoustic method to correct \
the volume of an Ogg Vorbis file to a predefined standardized \
loudness. \
 \
It is meant as a replacement for the normalization that is commonly \
used before encoding. Although normalization will ensure that each \
song has the same peak volume, this unfortunately does not say \
anything about the apparent loudness of the music, with the end result \
being that many normalized files still don't sound equally \
loud. VorbisGain uses psychoacoustics to address this \
deficiency. Moreover, unlike normalization, it's a lossless procedure \
which works by adding tags to the file. Additionally, it will add \
hints that can be used to prevent clipping on playback. It is based \
upon the ReplayGain technology. \
 \
The end result is that playback is both more convenient and of higher \
quality compared to a non-VorbisGain'ed file."
LICENSE = "LGPL-2.1-only"

PV = "0.37"

RPM_NAME = "vorbisgain-0.37-3.1.aarch64.rpm"
RPM_HASH = "babe732da8084cf66a66638ede71fefd5d46cda2cf9c13fc04eb3f9e43b7c69baae6b38494b3e36d0ca9d9c859d8e218df77802fc5b84fb8f1396230284d9868"

RPROVIDES:${PN} += "vorbisgain \
vorbisgain(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libogg.so.0()(64bit) \
libvorbis.so.0()(64bit) \
libvorbisfile.so.3()(64bit)"

inherit rpm
