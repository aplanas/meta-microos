SUMMARY = "CLI tool to detect silence in audio-files"
DESCRIPTION = "Standalone application to analyze audio files for silence and \
print ranges of detected signals. \
 \
Silan uses ffmpeg/libav and supports a wide variety of audio \
codecs and formats."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.0"

RPM_NAME = "silan-0.4.0-2.3.aarch64.rpm"
RPM_HASH = "87b29f67d593b355d09b7b5ebcdf9776c6d693378bffd92aea36fdf3a16b4f41eefe5655fabc308fa479a0bf9f02e054d62cbececc625e7e507d27ce1967095a"

RPROVIDES:${PN} += "silan"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libavcodec.so.58.134 \
libavformat.so.58.76 \
libavutil.so.56.70 \
libc.so.6 \
libm.so.6 \
libsndfile.so.1"

inherit rpm
