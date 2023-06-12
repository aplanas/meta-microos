SUMMARY = "DOS/x86 emulator to run old DOS games"
DESCRIPTION = "dosbox-staging is DOS/x86 emulator focusing on ease of use. \
Based on DOSBox, it is a fork which use modern library (e.g.: sdl2) and \
practice in an attempt to revitalize the development process. \
DOSBox Staging is an attempt to revitalize DOSBox's development process. \
It's not a rewrite, but a continuation and improvement on the existing \
DOSBox codebase while leveraging modern development tools and practices. \
Added support: Opus, FLAC, MT32, GM, GUS, Raw mouse input and more. \
https://github.com/dosbox-staging/dosbox-staging#readme"
LICENSE = "GPL-2.0-or-later"

PV = "0.80.1"

RPM_NAME = "dosbox-0.80.1-1.4.aarch64.rpm"
RPM_HASH = "a483ebaffb3388b5e0127b085268a52acb27b931f2416321f806c76517e59591fa6067973ae14d8dc3a7c31bbf8135230122fc3fe53aaa67552d1c4d45250298"

RPROVIDES:${PN} += "application() \
application(dosbox.desktop) \
dosbox \
dosbox(aarch-64) \
metainfo() \
metainfo(dosbox.metainfo.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGL.so.1()(64bit) \
libSDL2-2.0.so.0()(64bit) \
libSDL2-2.0.so.0(SUSE_2.0.10)(64bit) \
libSDL2-2.0.so.0(SUSE_2.0.14)(64bit) \
libSDL2-2.0.so.0(SUSE_2.0.5)(64bit) \
libSDL2-2.0.so.0(SUSE_2.0.7)(64bit) \
libSDL2-2.0.so.0(SUSE_2.24.0)(64bit) \
libSDL2_image-2.0.so.0()(64bit) \
libSDL2_net-2.0.so.0()(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfluidsynth.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libiir.so.1()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmt32emu.so.2()(64bit) \
libopusfile.so.0()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libslirp.so.0()(64bit) \
libslirp.so.0(SLIRP_4.0)(64bit) \
libslirp.so.0(SLIRP_4.1)(64bit) \
libspeexdsp.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
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
libstdc++.so.6(GLIBCXX_3.4.30)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libz.so.1()(64bit)"

inherit rpm
