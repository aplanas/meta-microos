SUMMARY = "Monitor Program for the icecream Compile Farm"
DESCRIPTION = "icecream is the next generation distcc. This package provides a monitor \
program."
LICENSE = "GPL-2.0-or-later"

PV = "3.3"

RPM_NAME = "icecream-monitor-3.3-1.21.aarch64.rpm"
RPM_HASH = "3ba5e2216af7924eb72cdb4d11a92145551aaeedd8f5f1cddfc82ec77bb289f493f6318fe15b6e25fdf2e9d023f93e2c2a362b8994142e3e169f2bfbf567d80d"

RPROVIDES:${PN} += "application() \
application(icemon.desktop) \
icecream-monitor \
icecream-monitor(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcap-ng.so.0()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
liblzo2.so.2()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
