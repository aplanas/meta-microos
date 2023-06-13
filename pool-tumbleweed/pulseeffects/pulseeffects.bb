SUMMARY = "Audio effects for Pulseaudio applications"
DESCRIPTION = "PulseEffects is a limiter, compressor, reverberation, stereo equalizer and auto volume \
effects for Pulseaudio applications."
LICENSE = "GPL-3.0-or-later"

PV = "4.8.7"

RPM_NAME = "pulseeffects-4.8.7-1.8.aarch64.rpm"
RPM_HASH = "b2d5be8a4d195566d4ae5aa7c60e07033a212d4c75e13ecc2aab076db54a33cc0fba4a4815d4876d42a905b5103501dcfd7ab34d3b30a99f86632e6300044ae6"

RPROVIDES:${PN} += "application() \
application(com.github.wwmm.pulseeffects.desktop) \
gstreamer1(element-peadapter)()(64bit) \
gstreamer1(element-peautogain)()(64bit) \
gstreamer1(element-peconvolver)()(64bit) \
gstreamer1(element-pecrystalizer)()(64bit) \
libgstpeadapter.so()(64bit) \
libgstpeautogain.so()(64bit) \
libgstpeconvolver.so()(64bit) \
libgstpecrystalizer.so()(64bit) \
metainfo() \
metainfo(com.github.wwmm.pulseeffects.appdata.xml) \
pulseeffects \
pulseeffects(aarch-64)"

RDEPENDS:${PN} += "dconf \
gstreamer-plugins-bad \
gstreamer-plugins-good \
ladspa-swh-plugins \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libatkmm-1.6.so.1()(64bit) \
libboost_filesystem.so.1.82.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairomm-1.0.so.1()(64bit) \
libebur128.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgdkmm-3.0.so.1()(64bit) \
libgio-2.0.so.0()(64bit) \
libgiomm-2.4.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libglibmm-2.4.so.1()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstaudio-1.0.so.0()(64bit) \
libgstbase-1.0.so.0()(64bit) \
libgstfft-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgtkmm-3.0.so.1()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpangomm-1.4.so.1()(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
libsamplerate.so.0()(64bit) \
libsamplerate.so.0(libsamplerate.so.0.0)(64bit) \
libsigc-2.0.so.0()(64bit) \
libsndfile.so.1()(64bit) \
libsndfile.so.1(libsndfile.so.1.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.11)(64bit) \
libstdc++.so.6(CXXABI_1.3.13)(64bit) \
libstdc++.so.6(CXXABI_1.3.2)(64bit) \
libstdc++.so.6(CXXABI_1.3.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libzita-convolver.so.4()(64bit) \
pulseaudio"

inherit rpm
