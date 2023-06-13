SUMMARY = "Pulseaudio support for ptlib"
DESCRIPTION = "This plugin enables pulseaudio support for ptlib."
LICENSE = "MPL-1.0"

PV = "2.18.8"

RPM_NAME = "libpt2_18_8-plugins-pulse-2.18.8-1.5.aarch64.rpm"
RPM_HASH = "9a14fbe2195eeb17d93a356ea29c000c8cdff27e784f38ce35c59e07de19efc5a1ab7fd8ea2bd0bb9eb108669677d8d4875ac5849c5509630a5509bdd4274f98"

RPROVIDES:${PN} += "libpt2-audio-plugin \
libpt2_18_8-plugins-pulse \
libpt2_18_8-plugins-pulse(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libpt.so.2.18.8()(64bit) \
libpt2_18_8 \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
