SUMMARY = "Dictionary Tool for Anthy"
DESCRIPTION = "A graphical tool to edit the personal dictionary for Anthy."
LICENSE = "GPL-2.0-or-later"

PV = "2.5"

RPM_NAME = "kasumi-2.5-23.9.aarch64.rpm"
RPM_HASH = "31714b91253252987a6db4ab780d95896c74336f149463f30efc81cf1b2c04e27853bbc6737982f85997a39a84a98018f98a8d2a6dd2c64e64a343854185e572"

RPROVIDES:${PN} += "application() \
application(kasumi.desktop) \
kasumi \
kasumi(aarch-64) \
locale(anthy:ja)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libanthy.so.0()(64bit) \
libanthydic.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgdk-3.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.1)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
