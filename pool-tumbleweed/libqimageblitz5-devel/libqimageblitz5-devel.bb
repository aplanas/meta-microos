SUMMARY = "Development files for libqimageblitz5"
DESCRIPTION = "This package contains development files for libqimageblitz5."
LICENSE = "BSD-2-Clause"

PV = "0.0.6+svn1515099"

RPM_NAME = "libqimageblitz5-devel-0.0.6+svn1515099-4.13.aarch64.rpm"
RPM_HASH = "ddd38447d1351f0e9846f3e7ae8f29ae25ab63d560b9e7b505cd30938717b0d12d2bc5dff904b45a6860136ade6236b3c6131b065232ade26f903666a5ea7553"

RPROVIDES:${PN} += "libqimageblitz5-devel \
libqimageblitz5-devel(aarch-64) \
pkgconfig(qimageblitz5)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libqimageblitz5-1 \
libqimageblitz5.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
pkgconfig(Qt5Gui)"

inherit rpm
