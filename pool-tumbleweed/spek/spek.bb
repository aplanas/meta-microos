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

RPROVIDES:${PN} += "spek"

RDEPENDS:${PN} += "libavcodec.so.59 \
libavformat.so.59 \
libavutil.so.57 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-net-suse.so.9.0.0 \
libwx-baseu-suse.so.9.0.0 \
libwx-gtk2u-core-suse.so.9.0.0"

inherit rpm
