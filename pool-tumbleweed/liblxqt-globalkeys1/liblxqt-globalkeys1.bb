SUMMARY = "Lxqt-globalkeys libraries"
DESCRIPTION = "lxqt-globalkeys main system library"
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "liblxqt-globalkeys1-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "df7f3196c17e330653cd497666935669184d70f6ce4386b794b8293a4e3bfe42d5f3941ab9d855e9ef3fe82c76492d3789a0c7f4f5b35ce360eeded260e61f01"

RPROVIDES:${PN} += "liblxqt-globalkeys.so.1()(64bit) \
liblxqt-globalkeys1 \
liblxqt-globalkeys1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
