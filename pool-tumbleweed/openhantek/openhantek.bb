SUMMARY = "Software for Hantek DSO6022 USB digital signal oscilloscopes"
DESCRIPTION = "OpenHantek6022 is a free software for Hantek DSO6022 USB digital signal \
oscilloscopes that is actively developed on \
github.com/OpenHantek/OpenHantek6022 - but only for Hantek 6022BE/BL and \
compatible scopes (Voltcraft, Darkwire, Protek, Acetech, etc.)."
LICENSE = "GPL-3.0-or-later"

PV = "3.3.2.2"

RPM_NAME = "openhantek-3.3.2.2-1.1.aarch64.rpm"
RPM_HASH = "579b6f3272968d02ddecaa05fb0dc269b05645aa706a360230b4555aef76f0dece0992fd1a74c88aaa12785f6ebf3e91ee602a38f1a5065b51e32feb261ead80"

RPROVIDES:${PN} += "application() \
application(OpenHantek.desktop) \
openhantek \
openhantek(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfftw3.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.30)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libusb-1.0.so.0()(64bit)"

inherit rpm
