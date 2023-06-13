SUMMARY = "A modern Dune II reimplementation"
DESCRIPTION = "Lead one of three interplanetary houses, Atreides, Harkonnen or Ordos, \
in an attempt to harvest the largest amount of spice from the sand \
dunes. Exchange your spice stockpiles for credits through refinement \
and build an army capable of thwarting attempts of the other houses to \
stop your harvesting! \
 \
Dune Legacy is an effort by a handful of developers to revitalize the \
first-ever real-time strategy game. The original game was the basis \
for the hugely successful Command and Conquer series, and the gameplay \
has been replicated an extended to a wide variety of storylines and \
series. \
 \
NOTE: Original Dune 2 game files are needed."
LICENSE = "GPL-2.0+"

PV = "0.96.4"

RPM_NAME = "dunelegacy-0.96.4-3.25.aarch64.rpm"
RPM_HASH = "7ce37fe3bce1bd179e4800602b74dd54238a6eb68d12f47d8389d5c32b1129430c77c1d6049e4998a0056c3e8d0b7f1ecb301661ecba7cec332f61bd2c1512d1"

RPROVIDES:${PN} += "application() \
application(dunelegacy.desktop) \
dunelegacy \
dunelegacy(aarch-64) \
metainfo() \
metainfo(dunelegacy.appdata.xml)"

RDEPENDS:${PN} += "libSDL2-2.0.so.0()(64bit) \
libSDL2-2.0.so.0(SUSE_2.0.10)(64bit) \
libSDL2_mixer-2.0.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_4.5.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
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
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
