SUMMARY = "Vietnamese engine for IBus input platform"
DESCRIPTION = "A Vietnamese engine for IBus input platform that uses Unikey."
LICENSE = "GPL-3.0"

PV = "0.6.1"

RPM_NAME = "ibus-unikey-0.6.1-11.15.aarch64.rpm"
RPM_HASH = "3ea020d80d03528dc85bff46cde3993d16739cc2ca1babce8aa3d8f8f0f3d446312b6428b1787386062f0a00ceeb1358f369c29e70ea49e67bf1ee1ff2f72d52"

RPROVIDES:${PN} += "ibus-unikey \
ibus-unikey(aarch-64) \
locale(ibus:vi)"

RDEPENDS:${PN} += "ibus \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libibus-1.0.so.5()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
