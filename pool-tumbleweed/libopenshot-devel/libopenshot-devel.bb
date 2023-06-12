SUMMARY = "Development files for libopenshot"
DESCRIPTION = "A library for video editing, composition, animation, and playback, \
which focuses on The library is written in C++. \
 \
This package contains header files and libraries needed to develop \
application that use libopenshot."
LICENSE = "LGPL-3.0-or-later"

PV = "0.3.1"

RPM_NAME = "libopenshot-devel-0.3.1-1.1.aarch64.rpm"
RPM_HASH = "5a871f98d32e81836c25bd8e81e7d7c9a67351b7cd04c227b2eda3ef93cd7e91ea592b796104c6a85051cd9da46e603f34114fe82e645368f5ab38cbd26821ff"

RPROVIDES:${PN} += "libopenshot-devel \
libopenshot-devel(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libjsoncpp.so.25()(64bit) \
libopenshot-audio.so.9()(64bit) \
libopenshot.so.24()(64bit) \
libopenshot24 \
libruby3.2.so.3.2()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
