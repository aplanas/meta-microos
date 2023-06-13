SUMMARY = "LADSPA REV-plugin"
DESCRIPTION = "This package provides LADSPA (Linux Audio Developer's Simple Plug-in API) \
plugin to implement a stereo reverb effect based on greverb."
LICENSE = "GPL-2.0+"

PV = "0.3.1"

RPM_NAME = "ladspa-REV-0.3.1-4.26.aarch64.rpm"
RPM_HASH = "de75ce68d1596c3260bcbd0aecb8971f542fcc3298e281c13794212ee759150c07278118264000446bcca678e8a2033e7722b171568375febdba7a62c3589dc2"

RPROVIDES:${PN} += "ladspa-REV \
ladspa-REV(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
