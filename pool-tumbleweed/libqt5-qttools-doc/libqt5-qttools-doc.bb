SUMMARY = "Qt 5 tool used by Qt Developers to generate documentation"
DESCRIPTION = "Qt 5 tool used by Qt Developers to generate documentation for software projects."
LICENSE = "GPL-3.0-only"

PV = "5.15.10+kde3"

RPM_NAME = "libqt5-qttools-doc-5.15.10+kde3-1.1.aarch64.rpm"
RPM_HASH = "fce8c0959c6e02a7aa2e5995dec7fbbc6ce51ccedfffec544e88fd7f5a6795f8d79dcd4b49519fdd81e2344500f92df65bcd81e09562f409c1d5d409ac75f791"

RPROVIDES:${PN} += "cmake-Qt5DocTools \
libqt5-qtbase-doc \
libqt5-qttools-doc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libclang.so.13 \
libstdc++.so.6"

inherit rpm
