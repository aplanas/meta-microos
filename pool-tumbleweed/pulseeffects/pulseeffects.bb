SUMMARY = "Audio effects for Pulseaudio applications"
DESCRIPTION = "PulseEffects is a limiter, compressor, reverberation, stereo equalizer and auto volume \
effects for Pulseaudio applications."
LICENSE = "GPL-3.0-or-later"

PV = "4.8.7"

RPM_NAME = "pulseeffects-4.8.7-1.9.aarch64.rpm"
RPM_HASH = "8bfde0cd82cea20c0717855cc3aff39b1d3157f3f6ede8d48aa066a70c4d2d3e51a677dea4a72ae58451f44609b0db2b00e400bff798ec833cc6e722d11809ca"

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
