SUMMARY = "Qt Help files generator"
DESCRIPTION = "Qt 6 tool for generating .qch help catalogs."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-tools-helpgenerators-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "3f386348a02b4e4ec8b4509f9d541f779db5e28ae78c6a07f6a3178605ece3963c7d272cfd4cadcbf4d692b124fbad2654e0dbe45726e0b768163eda2afe72ea"

RPROVIDES:${PN} += "qt6-tools-helpgenerators \
qt6-tools-helpgenerators(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Help.so.6()(64bit) \
libQt6Help.so.6(Qt_6)(64bit) \
libQt6Sql.so.6()(64bit) \
libQt6Sql.so.6(Qt_6)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
qt6-docs-common \
qt6-sql-sqlite"

inherit rpm
