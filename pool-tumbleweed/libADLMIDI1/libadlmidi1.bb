SUMMARY = "A Software MIDI Synthesizer library with OPL3 (YMF262) emulator"
DESCRIPTION = "A software MIDI synthesizer library with OPL3 emulation (FM synthesis). \
The library is based on the ADLMIDI, a multiplatform MIDI player with OPL3 emulation: \
https://bisqwit.iki.fi/source/adlmidi.html"
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "1.5.1"

RPM_NAME = "libADLMIDI1-1.5.1-1.3.aarch64.rpm"
RPM_HASH = "5a2e8ac135fd6a42abb3db383dfc6f88b1b38f6fbfe523cf2949565fbeb220d21596407a89279c557ed8af6a8605297bc97613f78fb3714aa19e88b6cd8a440a"

RPROVIDES:${PN} += "libADLMIDI.so.1()(64bit) \
libADLMIDI1 \
libADLMIDI1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgcc_s.so.1(GCC_4.0.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
