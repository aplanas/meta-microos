SUMMARY = "UI lxqt-globalkeys libraries"
DESCRIPTION = "UI system libraries for lxqt-globalkeys"
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "liblxqt-globalkeys-ui1-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "199d8098850086fb69517bb75fcf317f19b8957bad30eba68dca4ef08677b03e04b98dda6b783bba1ff4c45c7c2ccdeb6242c4027e4c65b92b7d078488d1fc7a"

RPROVIDES:${PN} += "liblxqt-globalkeys-ui.so.1()(64bit) \
liblxqt-globalkeys-ui1 \
liblxqt-globalkeys-ui1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
liblxqt-globalkeys.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
