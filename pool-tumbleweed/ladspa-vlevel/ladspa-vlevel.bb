SUMMARY = "LADSPA vlevel plugin"
DESCRIPTION = "This package provides a LADSPA (Linux Audio Developer's Simple Plug-in API) \
plugin and a tool to amplify the soft parts of music so you don't have to \
fiddle with the volume control."
LICENSE = "GPL-2.0+"

PV = "0.5"

RPM_NAME = "ladspa-vlevel-0.5-4.28.aarch64.rpm"
RPM_HASH = "419cbb57bf6f64aede4119148157b2da25a0fcfcb6f835186a9e05d45ccd7723146f644d8d401303f9d65dc53e528a1dbb1c2c34a007ab2b654206c8e96b2af3"

RPROVIDES:${PN} += "ladspa-vlevel \
ladspa-vlevel(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
