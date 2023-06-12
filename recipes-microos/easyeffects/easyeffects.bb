SUMMARY = "Audio effects for Pulseaudio applications"
DESCRIPTION = "Easyeffects is a limiter, compressor, reverberation, stereo equalizer and auto volume \
effects for pipewire applications."
LICENSE = "GPL-3.0-or-later"

PV = "7.0.3"

RPM_NAME = "easyeffects-7.0.3-1.1.aarch64.rpm"
RPM_HASH = "e773727735161e34f0c7afb0234a528edafb3ffdea1f4617851d3c04a81711b6ff68f1a894293c3cb634053639e91c84ff7ad00510339dd7497988c32d206a91"

RPROVIDES:${PN} += "application() \
application(com.github.wwmm.easyeffects.desktop) \
easyeffects \
easyeffects(aarch-64) \
metainfo() \
metainfo(com.github.wwmm.easyeffects.metainfo.xml)"
RDEPENDS:${PN} += "dconf \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libadwaita-1.so.0()(64bit) \
libadwaita-1.so.0(LIBADWAITA_1_0)(64bit) \
libbs2b.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libebur128.so.1()(64bit) \
libfftw3.so.3()(64bit) \
libfftw3f.so.3()(64bit) \
libfmt.so.9()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgcc_s.so.1(GCC_4.5.0)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgsl.so.27()(64bit) \
libgslcblas.so.0()(64bit) \
libgtk-4.so.1()(64bit) \
liblilv-0.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpango-1.0.so.0()(64bit) \
libpipewire-0.3.so.0()(64bit) \
librnnoise.so.0()(64bit) \
librubberband.so.2()(64bit) \
libsamplerate.so.0()(64bit) \
libsamplerate.so.0(libsamplerate.so.0.0)(64bit) \
libsigc-3.0.so.0()(64bit) \
libsndfile.so.1()(64bit) \
libsndfile.so.1(libsndfile.so.1.0)(64bit) \
libspeexdsp.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.11)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.31)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libtbb.so.12()(64bit) \
libzita-convolver.so.4()(64bit)"

inherit rpm
