SUMMARY = "Graphical effect and filter library for Qt5"
DESCRIPTION = "libqimageblitz5 is a graphical effect and filter library for Qt5 \
that contains many improvements over KDE 3.x's kdefx library \
including bugfixes, memory and speed improvements, and MMX/SSE \
support."
LICENSE = "BSD-2-Clause"

PV = "0.0.6+svn1515099"

RPM_NAME = "libqimageblitz5-1-0.0.6+svn1515099-4.13.aarch64.rpm"
RPM_HASH = "1ccff7dc799d0ea884a35c2436349283c009913f2f3ff17612ecbee9630bdb3ed075b5bd33346a954db5ccca496a2cd013f22e1de22893d2f88a5e869747daea"

RPROVIDES:${PN} += "libqimageblitz5-1 \
libqimageblitz5-1(aarch-64) \
libqimageblitz5.so.1()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
