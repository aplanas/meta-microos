SUMMARY = "Samsung Galaxy S Device Firmware Flasher"
DESCRIPTION = "Heimdall is a tool suite used to flash firmware (aka ROMs) onto \
Samsung Galaxy S devices. \
 \
This package contains a graphical user interface for Heimdall."
LICENSE = "MIT"

PV = "1.4.2"

RPM_NAME = "heimdall-frontend-1.4.2-1.28.aarch64.rpm"
RPM_HASH = "5ed563ee864593a019bdbb78022b6cb0977d8f936f3eb5c4d0af21be9b8ba36151fb0e6717841509f1f5821d7f6ef347ba9f00f005f4d10b818ae1018fa7bc8a"

RPROVIDES:${PN} += "application() \
application(heimdall.desktop) \
heimdall-frontend \
heimdall-frontend(aarch-64)"

RDEPENDS:${PN} += "heimdall \
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
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libz.so.1()(64bit)"

inherit rpm
