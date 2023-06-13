SUMMARY = "GUI for Firajail security sandbox"
DESCRIPTION = "Firetools is the graphical user interface of Firejail security sandbox."
LICENSE = "GPL-2.0-only"

PV = "0.9.72"

RPM_NAME = "firetools-0.9.72-1.3.aarch64.rpm"
RPM_HASH = "8daeab764a4db63d07d9c510298df1120b03f4289f3209377c64cc2db16df6f6a72531a6f14022848d8a6e69440b776697b334d47a2deeabc3de54794c0d89d6"

RPROVIDES:${PN} += "application() \
application(firejail-ui.desktop) \
application(firetools.desktop) \
firetools \
firetools(aarch-64)"

RDEPENDS:${PN} += "firejail \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
