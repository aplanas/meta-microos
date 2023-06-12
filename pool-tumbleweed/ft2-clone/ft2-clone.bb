SUMMARY = "Fasttracker II clone"
DESCRIPTION = "Multi-platform clone of the classic music making software \
Fasttracker II. It can load XM, MOD, S3M, STM module files."
LICENSE = "BSD-3-Clause & CC-BY-NC-SA-4.0"

PV = "1.66"

RPM_NAME = "ft2-clone-1.66-1.1.aarch64.rpm"
RPM_HASH = "6626e96f8ac50d6f01ab317036e42b828f14300ac0091064cc3ef69c15efd1045e17da1d11d87a9c80cacca55331bf8288741910d0db9b5c7ecd0689e634c350"

RPROVIDES:${PN} += "application() \
application(ft2-clone.desktop) \
bundled(rtmidi) \
ft2-clone \
ft2-clone(aarch-64) \
mimehandler(audio/mod) \
mimehandler(audio/s3m) \
mimehandler(audio/stm) \
mimehandler(audio/xm)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libFLAC.so.12()(64bit) \
libSDL2-2.0.so.0()(64bit) \
libSDL2-2.0.so.0(SUSE_2.0.5)(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm