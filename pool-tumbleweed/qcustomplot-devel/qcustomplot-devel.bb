SUMMARY = "Development files for QCustomPlot"
DESCRIPTION = "This package contains libraries and header files for \
developing applications that use QCustomPlot."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.1"

RPM_NAME = "qcustomplot-devel-2.1.1-2.3.aarch64.rpm"
RPM_HASH = "28fc541d6d90be94fe0a1762a102824eaa96662da217fd5851fdefb331676a88ca132c194fd7f9fbdc27f3b3c41a8926397a278da2fb83a1156b77af84aa8d29"

RPROVIDES:${PN} += "libqcustomplot.so.2()(64bit) \
pkgconfig(qcustomplot) \
qcustomplot-devel \
qcustomplot-devel(aarch-64) \
qcustomplot-qt5-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libqcustomplot2 \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
pkgconfig(Qt5PrintSupport)"

inherit rpm
