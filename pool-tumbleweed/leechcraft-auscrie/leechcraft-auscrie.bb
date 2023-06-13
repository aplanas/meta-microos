SUMMARY = "LeechCraft Screenshooter Module"
DESCRIPTION = "This package provides a LeechCraft plugin to make screenshots of \
LeechCraft and then either save them locally or upload them to an \
imagebin."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-auscrie-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "00ebdc615b2863d528212bc233f57850a39e8e7ade91e96fcf207a9b6446d9e57c098beb0e6589499c338cc84ea364d18e146235b0002383238f5e3de4234a07"

RPROVIDES:${PN} += "leechcraft-auscrie \
leechcraft-auscrie(aarch-64) \
libleechcraft_auscrie.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
leechcraft \
leechcraft-imgaste \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libleechcraft-util-qt5.so.0.6.75()(64bit) \
libleechcraft-util-xpc-qt5.so.0.6.75.2()(64bit) \
libleechcraft-xsd-qt5.so.0.6.75.2()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
