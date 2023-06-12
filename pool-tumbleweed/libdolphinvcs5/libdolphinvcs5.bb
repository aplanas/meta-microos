SUMMARY = "KDE File Manager"
DESCRIPTION = "This package contains the libraries used by Dolphin and Konqueror."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "libdolphinvcs5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "d029888ac0cef22157bc8b8c676e3b75931c11ff31582aa6201631360f0e016e8e7cdc502d8639cfb3556abac741b43a321719be7d888a2b7c65f2b00c512e0c"

RPROVIDES:${PN} += "libdolphinvcs.so.5()(64bit) \
libdolphinvcs5 \
libdolphinvcs5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit)"

inherit rpm
