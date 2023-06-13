SUMMARY = "The Mozc engine for IBus"
DESCRIPTION = "The Mozc engine for IBus provides a Japanese input method."
LICENSE = "Apache-2.0 & BSD-3-Clause & SUSE-Public-Domain"

PV = "2.28.4715.102"

RPM_NAME = "ibus-mozc-2.28.4715.102-2.1.aarch64.rpm"
RPM_HASH = "94e8aa60f9307f6278473535b08cdb65ab7513930ae4b482ba42b478eb549c7172ed0228023b8cebf985766b261f4a68f1be5e904ca060c6e973d2089017cfc6"

RPROVIDES:${PN} += "application() \
application(ibus-setup-mozc-dv.desktop) \
application(ibus-setup-mozc-jp-jp.desktop) \
application(ibus-setup-mozc-jp.desktop) \
application(ibus-setup-mozc-us.desktop) \
ibus-mozc \
ibus-mozc(aarch-64) \
locale(ibus:ja)"

RDEPENDS:${PN} += "ibus \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libibus-1.0.so.5()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.17)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libxcb-xfixes.so.0()(64bit) \
libxcb.so.1()(64bit) \
libz.so.1()(64bit) \
mozc \
mozc-gui-tools"

inherit rpm
