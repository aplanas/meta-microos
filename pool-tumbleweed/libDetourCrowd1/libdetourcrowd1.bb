SUMMARY = "Detour Crowd Library for Recastnatnaviagtion"
DESCRIPTION = "This package contains the detour crowd library part of Recastnatnaviagtion."
LICENSE = "Zlib"

PV = "1.5.1+git20210305.c5cbd53"

RPM_NAME = "libDetourCrowd1-1.5.1+git20210305.c5cbd53-1.7.aarch64.rpm"
RPM_HASH = "050031534e431817933d14732d86c43abfde9ec1e9e65d300ed7851b33e0713b029e3b13ab652f4aa5ed93f939ca1ae7cac6e7d810f04ee7b2b4354fb6dcfdb8"

RPROVIDES:${PN} += "libDetourCrowd.so.1()(64bit) \
libDetourCrowd1 \
libDetourCrowd1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libDetour.so.1()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit)"

inherit rpm
