SUMMARY = "Batch images solver based on stellarsolver"
DESCRIPTION = "Tool that one could use to automatically solve, extract, and export a large number of images. \
This program is primarily meant for data reduction, but could also be used as a test for the library."
LICENSE = "GPL-3.0-or-later"

PV = "2.4"

RPM_NAME = "stellarbatchsolver-2.4-2.3.aarch64.rpm"
RPM_HASH = "c28c15826d66d6bc5b56c4986d8f6f6d7738e8377facba13b620d4618b87b0a2cc6dfa233c6c7d6a72bc1f20d0b627a0685821ccef11c8740ecd84393bd76de1"

RPROVIDES:${PN} += "application() \
application(com.github.rlancaste.stellarbatchsolver.desktop) \
stellarbatchsolver \
stellarbatchsolver(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcfitsio.so.10()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstellarsolver.so.2()(64bit)"

inherit rpm
