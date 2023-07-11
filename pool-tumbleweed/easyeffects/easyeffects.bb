SUMMARY = "Audio effects for Pulseaudio applications"
DESCRIPTION = "Easyeffects is a limiter, compressor, reverberation, stereo equalizer and auto volume \
effects for pipewire applications."
LICENSE = "GPL-3.0-or-later"

PV = "7.0.3"

RPM_NAME = "easyeffects-7.0.3-1.2.aarch64.rpm"
RPM_HASH = "6c165f5059da60125aac0a6273a55849067071cade7f33156fbb44a61b9421554968190d4cd50a15bd7900943605271e26c5c685236c402bfaeb3d4412733ad2"

RPROVIDES:${PN} += "easyeffects"

RDEPENDS:${PN} += "dconf \
ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libbs2b.so.0 \
libc.so.6 \
libcairo.so.2 \
libebur128.so.1 \
libfftw3.so.3 \
libfftw3f.so.3 \
libfmt.so.9 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgsl.so.27 \
libgslcblas.so.0 \
libgtk-4.so.1 \
liblilv-0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpipewire-0.3.so.0 \
librnnoise.so.0 \
librubberband.so.2 \
libsamplerate.so.0 \
libsigc-3.0.so.0 \
libsndfile.so.1 \
libspeexdsp.so.1 \
libstdc++.so.6 \
libtbb.so.12 \
libzita-convolver.so.4"

inherit rpm
