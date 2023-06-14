SUMMARY = "CLI tool to detect silence in audio-files"
DESCRIPTION = "Standalone application to analyze audio files for silence and \
print ranges of detected signals. \
 \
Silan uses ffmpeg/libav and supports a wide variety of audio \
codecs and formats."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.0"

RPM_NAME = "silan-0.4.0-2.2.aarch64.rpm"
RPM_HASH = "863a4a7179e18eae10bc65c98af35c1ea988b203cb2e858d1b2e68eb84a2b547c274f1e856fd47c370d407a465f0f746512c5a1d381a7136394c5c34d69a945a"

RPROVIDES:${PN} += "silan"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libavcodec.so.58.134 \
libavformat.so.58.76 \
libavutil.so.56.70 \
libc.so.6 \
libm.so.6 \
libsndfile.so.1"

inherit rpm
