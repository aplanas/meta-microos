SUMMARY = "Audio effects for Pulseaudio applications"
DESCRIPTION = "Easyeffects is a limiter, compressor, reverberation, stereo equalizer and auto volume \
effects for pipewire applications."
LICENSE = "GPL-3.0-or-later"

PV = "7.0.3"

RPM_NAME = "easyeffects-7.0.3-1.1.aarch64.rpm"
RPM_HASH = "e773727735161e34f0c7afb0234a528edafb3ffdea1f4617851d3c04a81711b6ff68f1a894293c3cb634053639e91c84ff7ad00510339dd7497988c32d206a91"

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
