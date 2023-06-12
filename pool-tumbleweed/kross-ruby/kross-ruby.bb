SUMMARY = "Ruby Bindings for kross"
DESCRIPTION = "The Ruby bindings which can be used with KROSS"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "kross-ruby-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "b6d2b386612dbbdbf0b64aa62ca85f33244f76fdc9c9bfb33ff27bb258de3839a2aa54c1a022ecf94ee6e2c6bbb96a67adee96575ecf4bf0cab461e23603501d"

RPROVIDES:${PN} += "kross-ruby \
kross-ruby(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5KrossCore.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libruby3.2.so.3.2()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
