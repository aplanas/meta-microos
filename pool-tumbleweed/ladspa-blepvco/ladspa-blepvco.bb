SUMMARY = "LADSPA blepvco plugin"
DESCRIPTION = "This package provides a LADSPA (Linux Audio Developer's Simple Plug-in API) \
blepvco plugins for three anti-aliased, minBLEP-based, hard-sync-capable \
oscillator plugins."
LICENSE = "GPL-2.0+"

PV = "0.1.0"

RPM_NAME = "ladspa-blepvco-0.1.0-4.24.aarch64.rpm"
RPM_HASH = "f59b29c7f2ce56af8e393326552446b215df9f1326d4a6c4a2d78ba1fb7ef1a4b7588b9bd0c89c4f7fbeffc03cbd2af6ba174311bb98d9bf55f1e3da65f8fae7"

RPROVIDES:${PN} += "ladspa-blepvco \
ladspa-blepvco(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
