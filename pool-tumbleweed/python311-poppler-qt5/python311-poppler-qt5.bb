SUMMARY = "Python binding to poppler-qt5"
DESCRIPTION = "A Python binding for libpoppler-qt5 that aims for completeness \
and for being actively maintained."
LICENSE = "LGPL-2.1-or-later"

PV = "21.3.0"

RPM_NAME = "python311-poppler-qt5-21.3.0-1.12.aarch64.rpm"
RPM_HASH = "15e51201f14e1044a2b7cf1f095ef8958e5dede6c2b768a9df7dfe410bc15f532bc212d026b7294daa3e1b6ca0e79f77e1eb567c47d14c39d74fc843707268ad"

RPROVIDES:${PN} += "python3.11dist(python-poppler-qt5) \
python311-poppler-qt5 \
python311-poppler-qt5(aarch-64) \
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
python311-qt5"

inherit rpm