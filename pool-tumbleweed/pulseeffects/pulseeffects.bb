SUMMARY = "Audio effects for Pulseaudio applications"
DESCRIPTION = "PulseEffects is a limiter, compressor, reverberation, stereo equalizer and auto volume \
effects for Pulseaudio applications."
LICENSE = "GPL-3.0-or-later"

PV = "4.8.7"

RPM_NAME = "pulseeffects-4.8.7-1.8.aarch64.rpm"
RPM_HASH = "b2d5be8a4d195566d4ae5aa7c60e07033a212d4c75e13ecc2aab076db54a33cc0fba4a4815d4876d42a905b5103501dcfd7ab34d3b30a99f86632e6300044ae6"

RPROVIDES:${PN} += "gstreamer1 \
libgstpeadapter.so \
libgstpeautogain.so \
libgstpeconvolver.so \
libgstpecrystalizer.so \
pulseeffects"

RDEPENDS:${PN} += "dconf \
gstreamer-plugins-bad \
gstreamer-plugins-good \
ladspa-swh-plugins \
ld-linux-aarch64.so.1 \
libatkmm-1.6.so.1 \
libboost-filesystem.so.1.82.0 \
libc.so.6 \
libcairomm-1.0.so.1 \
libebur128.so.1 \
libgcc-s.so.1 \
libgdkmm-3.0.so.1 \
libgio-2.0.so.0 \
libgiomm-2.4.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgobject-2.0.so.0 \
libgstaudio-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstfft-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0 \
libgtkmm-3.0.so.1 \
libm.so.6 \
libpangomm-1.4.so.1 \
libpulse.so.0 \
libsamplerate.so.0 \
libsigc-2.0.so.0 \
libsndfile.so.1 \
libstdc++.so.6 \
libzita-convolver.so.4 \
pulseaudio"

inherit rpm
