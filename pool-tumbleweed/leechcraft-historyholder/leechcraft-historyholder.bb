SUMMARY = "LeechCraft History Module"
DESCRIPTION = "This package provides a history keeper plugin for LeechCraft \
which stores information about finished downloads and similar events, \
and allows to search it by text, wildcard, regular expressions or tags."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-historyholder-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "c11aaa453340da4308153d6a10018bf05f0eca48ee33e8087ff8edd22a6a65cdfc37250f719aeb1a37388d0a0a4bcff91c63ebb9de3e249b67a2d676a9ee41b9"

RPROVIDES:${PN} += "leechcraft-historyholder \
leechcraft-historyholder(aarch-64) \
libleechcraft_historyholder.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
leechcraft \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Sql.so.5()(64bit) \
libQt5Sql.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libleechcraft-util-db-qt5.so.0.6.75.1()(64bit) \
libleechcraft-util-qt5.so.0.6.75()(64bit) \
libleechcraft-util-sys-qt5.so.0.6.75.1()(64bit) \
libleechcraft-util-tags-qt5.so.0.6.75.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
