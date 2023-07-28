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

PV = "0.8.5"

RPM_NAME = "spek-0.8.5-1.1.aarch64.rpm"
RPM_HASH = "b1b40eaae254b660f85f58409f1ccd942fb0a6b445bc5f8ec49b81d0d4d963306b22401d4e6f05b8051eac139b286f99943c93255095553b4ce727eb89a05b3e"

RPROVIDES:${PN} += "spek"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libavcodec.so.59 \
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
