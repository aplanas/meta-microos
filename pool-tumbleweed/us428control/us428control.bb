SUMMARY = "Sound Blaster 16 ASP/CSP control program"
DESCRIPTION = "This package contains a control tool for Tascam US-X2Y audio devices"
LICENSE = "GPL-2.0-or-later"

PV = "0.4.6"

RPM_NAME = "us428control-0.4.6-24.3.aarch64.rpm"
RPM_HASH = "753c34a843f91873a4bebf79e456ec9da7b75219659c4b8c79fa457f085169de20d335d646afe29b33eaac05d9f2dcb4f45710ff614146e7b2db78008e2e41bc"

RPROVIDES:${PN} += "alsa-tools:/usr/bin/us428control \
us428control \
us428control(aarch-64)"

RDEPENDS:${PN} += "alsa-firmware \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
