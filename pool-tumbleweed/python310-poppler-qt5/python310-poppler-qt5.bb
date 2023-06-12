SUMMARY = "Python binding to poppler-qt5"
DESCRIPTION = "A Python binding for libpoppler-qt5 that aims for completeness \
and for being actively maintained."
LICENSE = "LGPL-2.1-or-later"

PV = "21.3.0"

RPM_NAME = "python310-poppler-qt5-21.3.0-1.12.aarch64.rpm"
RPM_HASH = "a84da014c1a5e1af626be46b4a9b5c1c35637eb85d9cd224b036ed0078b259197fd0562c414d0ccd9e3d035a3b5ddcc6fc72498c58b372f5d511b6236025e979"

RPROVIDES:${PN} += "python3-poppler-qt5 \
python3.10dist(python-poppler-qt5) \
python310-poppler-qt5 \
python310-poppler-qt5(aarch-64) \
python3dist(python-poppler-qt5)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libpoppler-qt5.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
python(abi) \
python310-qt5"

inherit rpm