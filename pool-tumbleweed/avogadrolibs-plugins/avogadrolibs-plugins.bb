SUMMARY = "Plugins for Avogadro2libs"
DESCRIPTION = "This package contains the vendor provided plugins for Avogadro2"
LICENSE = "BSD-3-Clause"

PV = "1.97.0"

RPM_NAME = "avogadrolibs-plugins-1.97.0-2.3.aarch64.rpm"
RPM_HASH = "50f80122cf968529d03e83752c5033dca8e4d4574117add27479fc7b36cdb6f41b405176f49044c5906356801216ba45d53f9b232b771233f9614b1f71278425"

RPROVIDES:${PN} += "avogadrolibs-plugins \
avogadrolibs-plugins(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libAvogadroCalc.so.1()(64bit) \
libAvogadroCore.so.1()(64bit) \
libAvogadroIO.so.1()(64bit) \
libAvogadroMoleQueue.so.1()(64bit) \
libAvogadroQtGui.so.1()(64bit) \
libAvogadroQtOpenGL.so.1()(64bit) \
libAvogadroQuantumIO.so.1()(64bit) \
libAvogadroRendering.so.1()(64bit) \
libQt5Concurrent.so.5()(64bit) \
libQt5Concurrent.so.5(Qt_5)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libarchive.so.13()(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgcc_s.so.1(GCC_4.0.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmsym.so.0.2()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
