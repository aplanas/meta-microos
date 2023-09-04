SUMMARY = "Audio effects for Pulseaudio applications"
DESCRIPTION = "Easyeffects is a limiter, compressor, reverberation, stereo equalizer and auto volume \
effects for pipewire applications."
LICENSE = "GPL-3.0-or-later"

PV = "7.0.6"

RPM_NAME = "easyeffects-7.0.6-1.1.aarch64.rpm"
RPM_HASH = "366c019b79893e77272a04030fc3a1170ec70a3cba63209715cdf375b284bf215568d22cb4dabd2bd1e3091f0fa1d685149c6f6332a2c97f3e852369c1b696d9"

RPROVIDES:${PN} += "easyeffects"

RDEPENDS:${PN} += "dconf \
ld-linux-aarch64.so.1 \
libSoundTouch.so.1 \
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
libsamplerate.so.0 \
libsigc-3.0.so.0 \
libsndfile.so.1 \
libspeexdsp.so.1 \
libstdc++.so.6 \
libtbb.so.12 \
libzita-convolver.so.4"

inherit rpm
