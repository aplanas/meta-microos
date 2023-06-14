SUMMARY = "Qt 5 tool used by Qt Developers to generate documentation"
DESCRIPTION = "Qt 5 tool used by Qt Developers to generate documentation for software projects."
LICENSE = "GPL-3.0-only"

PV = "5.15.9+kde1"

RPM_NAME = "libqt5-qttools-doc-5.15.9+kde1-1.1.aarch64.rpm"
RPM_HASH = "dba7ab9b579d359c5a7184e413b580110f90e6df27c44dea4db1ac393d3d838c1ba6f4982e3d7bedbf5fa65bb971fe7fc74ea4b1951dea7655526fc93169e252"

RPROVIDES:${PN} += "cmake-Qt5DocTools \
libqt5-qtbase-doc \
libqt5-qttools-doc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libclang.so.13 \
libstdc++.so.6"

inherit rpm
