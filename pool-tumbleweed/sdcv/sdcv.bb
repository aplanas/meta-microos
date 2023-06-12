SUMMARY = "Console version of the Stardict program"
DESCRIPTION = "Console version of the Stardict program. \
It can employ all the dictionary files that belong to StarDict. \
The word sdcv stands for StarDict under Console Version."
LICENSE = "GPL-2.0-only"

PV = "0.5.4"

RPM_NAME = "sdcv-0.5.4-1.1.aarch64.rpm"
RPM_HASH = "caece3a059a0494060cb2b2698f3610510366fbce00e5f309551acda3774a71ccb755f2747a84791cfa87de34965a5b21dc419f560b2256377c8fb8165eac684"

RPROVIDES:${PN} += "sdcv \
sdcv(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libglib-2.0.so.0()(64bit) \
libreadline.so.8()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libz.so.1()(64bit)"

inherit rpm