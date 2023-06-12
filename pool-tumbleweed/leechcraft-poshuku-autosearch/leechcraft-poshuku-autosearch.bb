SUMMARY = "LeechCraft Poshuku Autosearch Module"
DESCRIPTION = "This package provides an autosearch plugin for LeechCraft Poshuku."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-poshuku-autosearch-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "87b64c87e36968dc92bd205eae22492e1475c14d22226c575961f50d4363cf879152530b9efddffff0d911e1e7bf8336b0a6037b5edeba7e3b6a844c1b10c1a1"

RPROVIDES:${PN} += "leechcraft-poshuku-autosearch \
leechcraft-poshuku-autosearch(aarch-64) \
libleechcraft_poshuku_autosearch.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
leechcraft-poshuku \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libleechcraft-util-qt5.so.0.6.75()(64bit) \
libleechcraft-util-sll-qt5.so.0.6.75.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
