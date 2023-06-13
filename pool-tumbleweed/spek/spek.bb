SUMMARY = "Tool for audio spectrum analysis and visualization"
DESCRIPTION = "Spek helps to analyse your audio files by showing their spectrogram. \
It supports all popular lossy and lossless audio file formats. \
 \
Features: \
  * Ultra-fast signal processing, uses multiple threads to further \
    speed up the analysis \
  * Shows the codec name and the audio signal parameters \
  * Can save the spectrogram as an image file \
  * Drag-and-drop support; associates with common audio file formats \
  * Auto-fitting time, frequency and spectral density rulers \
  * Adjustable spectral density range"
LICENSE = "GPL-3.0-only"

PV = "0.8.4"

RPM_NAME = "spek-0.8.4-2.3.aarch64.rpm"
RPM_HASH = "96d15d47d5250f960ac8361bb78a7cfef07f76fb57c370d77eaf7858142cbc0d57d9ab3f50c6d63d0b54aeae33a49619a3cfc9ef2aabb8fe8eb205a512562e7c"

RPROVIDES:${PN} += "application() \
application(spek.desktop) \
mimehandler(application/x-dts) \
mimehandler(application/x-flac) \
mimehandler(audio/3gpp) \
mimehandler(audio/AMR) \
mimehandler(audio/AMR-WB) \
mimehandler(audio/ac3) \
mimehandler(audio/basic) \
mimehandler(audio/mp4) \
mimehandler(audio/mpeg) \
mimehandler(audio/ogg) \
mimehandler(audio/prs.sid) \
mimehandler(audio/vnd.rn-realaudio) \
mimehandler(audio/x-aiff) \
mimehandler(audio/x-ape) \
mimehandler(audio/x-flac) \
mimehandler(audio/x-gsm) \
mimehandler(audio/x-it) \
mimehandler(audio/x-m4a) \
mimehandler(audio/x-matroska) \
mimehandler(audio/x-mp3) \
mimehandler(audio/x-mpeg) \
mimehandler(audio/x-ms-asf) \
mimehandler(audio/x-ms-asx) \
mimehandler(audio/x-ms-wax) \
mimehandler(audio/x-ms-wma) \
mimehandler(audio/x-musepack) \
mimehandler(audio/x-pn-aiff) \
mimehandler(audio/x-pn-au) \
mimehandler(audio/x-pn-wav) \
mimehandler(audio/x-pn-windows-acm) \
mimehandler(audio/x-real-audio) \
mimehandler(audio/x-realaudio) \
mimehandler(audio/x-sbc) \
mimehandler(audio/x-speex) \
mimehandler(audio/x-tta) \
mimehandler(audio/x-vorbis) \
mimehandler(audio/x-vorbis+ogg) \
mimehandler(audio/x-wav) \
mimehandler(audio/x-wavpack) \
mimehandler(audio/x-xm) \
spek \
spek(aarch-64)"

RDEPENDS:${PN} += "libavcodec.so.59()(64bit) \
libavcodec.so.59(LIBAVCODEC_59.37_SUSE)(64bit) \
libavformat.so.59()(64bit) \
libavformat.so.59(LIBAVFORMAT_59.27_SUSE)(64bit) \
libavutil.so.57()(64bit) \
libavutil.so.57(LIBAVUTIL_57.28_SUSE)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libwx_baseu-suse.so.9.0.0()(64bit) \
libwx_baseu-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_baseu_net-suse.so.9.0.0()(64bit) \
libwx_baseu_net-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk2u_core-suse.so.9.0.0()(64bit) \
libwx_gtk2u_core-suse.so.9.0.0(WXU_3.2)(64bit)"

inherit rpm
