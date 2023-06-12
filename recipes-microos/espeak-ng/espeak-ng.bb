SUMMARY = "Software speech synthesizer (text-to-speech)"
DESCRIPTION = "The eSpeak NG (Next Generation) Text-to-Speech program is a speech \
synthesizer that supports 100 languages and accents. It is based \
on the eSpeak engine created by Jonathan Duddington. It uses \
spectral formant synthesis by default which sounds robotic, but can \
be configured to use Klatt formant synthesis or MBROLA to give it a \
more natural sound."
LICENSE = "Apache-2.0 & BSD-2-Clause & GPL-3.0-or-later & Unicode-DFS-2015"

PV = "1.51"

RPM_NAME = "espeak-ng-1.51-1.8.aarch64.rpm"
RPM_HASH = "96a95436653fc8ad3067b1b316023f3e71943fc39027e18c827658ab897ad72738ae2e69a85a1b1515ff3c6b32d18973044f9654d00b32fc40724aeebb4d9324"

RPROVIDES:${PN} += "espeak-ng \
espeak-ng(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libespeak-ng.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpcaudio.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
