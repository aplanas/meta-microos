SUMMARY = "MIME email parser for KDE PIM - runtime plugins"
DESCRIPTION = "This package provides plugins required by PIM applications read and write parsed \
email data."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "akonadi-plugin-mime-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "5458ecc3ff7beae91ae138565005f42ba8339e282f559c0a78e07481d3df6e28f4827bc194969960d0c1ca207cfe02aa32d23ffd55a6a8dd5e8db8e15e8b8c52"

RPROVIDES:${PN} += "akonadi-plugin-mime akonadi-plugin-mime(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKPim5AkonadiCore.so.5()(64bit) libKPim5AkonadiMime.so.5()(64bit) libKPim5AkonadiMime5 libKPim5AkonadiPrivate.so.5()(64bit) libKPim5Mime.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
