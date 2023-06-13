SUMMARY = "Command line client to QStandardPaths"
DESCRIPTION = "Command line client to QStandardPaths."
LICENSE = "BSD-3-Clause"

PV = "5.15.9+kde1"

RPM_NAME = "libqt5-qtpaths-5.15.9+kde1-1.1.aarch64.rpm"
RPM_HASH = "6aa30ab644c120f92be635fce173e39b9e35402174f0d5ca0c641aa716e0afb94f7a998f92c0c2d3d2e5f04a98b3a5c7c25680e68821f992acb7ff58415a40b3"

RPROVIDES:${PN} += "libqt5-qtpaths \
libqt5-qtpaths(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
