SUMMARY = "LeechCraft Portable Player Logging Module"
DESCRIPTION = "This package provides Portable Player Logging support for the LeechCraft audio player."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-lmp-ppl-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "92cbe9be326a49b9df9e375669c66bc0845e0748d2891e22bbacdb6fb830fc88c4c631e94d6d2ff3b01c8fdfbf5245f74960c8ffffce6e29b043738995234a48"

RPROVIDES:${PN} += "leechcraft-lmp-ppl \
leechcraft-lmp-ppl(aarch-64) \
libleechcraft_lmp_ppl.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
leechcraft-lmp \
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
libleechcraft-util-sll-qt5.so.0.6.75.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit)"

inherit rpm
