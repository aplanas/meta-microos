SUMMARY = "Development files for the Qt5 D-Bus library"
DESCRIPTION = "Development files for the Qt5 D-Bus library. This package also \
contains Qt5's qdbusxml2cpp and qdbuscpp2xml binaries."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde154"

RPM_NAME = "libQt5DBus-devel-5.15.9+kde154-1.2.aarch64.rpm"
RPM_HASH = "72caa22139dce23821779586b85ebebc1a1c49de1977857eef39de9bf35e852d6a0bd8027c290b0fbcfa512e159f061bc4e41727d38629ff7e4936932a9a9e68"

RPROVIDES:${PN} += "cmake(Qt5DBus) \
libQt5DBus-devel \
libQt5DBus-devel(aarch-64) \
pkgconfig(Qt5DBus)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core-devel \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5DBus.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5DBus5 \
libc.so.6(GLIBC_2.34)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
pkgconfig(Qt5Core)"

inherit rpm
