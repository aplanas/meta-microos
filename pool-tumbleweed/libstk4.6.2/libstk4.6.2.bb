SUMMARY = "Synthesis ToolKit in C++"
DESCRIPTION = "The Synthesis ToolKit in C++ (STK) is a set of audio signal \
processing and algorithmic synthesis classes. STK facilitates \
development of music synthesis and audio processing software, \
focusing on realtime control and example code. STK is \
user-extensible."
LICENSE = "MIT"

PV = "4.6.2"

RPM_NAME = "libstk4.6.2-4.6.2-1.3.aarch64.rpm"
RPM_HASH = "8d0ebcc864b7840f22536f6d8dc116d046a7199c960876290f95dcb7b6716f70f6182016ce3813ad8ca17feb011ab8df649e47724cd3d3951cbe464186ec1dde"

RPROVIDES:${PN} += "libstk4.6.2 \
libstk4.6.2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libasound.so.2(ALSA_0.9.0rc4)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libjack.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
stk-data"

inherit rpm
