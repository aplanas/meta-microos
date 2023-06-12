SUMMARY = "Audio time-stretching and pitch-shifting library"
DESCRIPTION = "Rubber Band is a library and utility program that permits you to change the \
tempo and pitch of an audio recording independently of one another."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.0"

RPM_NAME = "librubberband2-3.1.0-1.3.aarch64.rpm"
RPM_HASH = "7b02d5550734f234bf847a979037016d5eb65bc6ae9df611832861caa7c6b9403f19d7641ae1b9d7ffd752b7eb2930b744f29e8cd960f8330b85d7e72ee89eb4"

RPROVIDES:${PN} += "librubberband.so.2()(64bit) \
librubberband2 \
librubberband2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfftw3.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
